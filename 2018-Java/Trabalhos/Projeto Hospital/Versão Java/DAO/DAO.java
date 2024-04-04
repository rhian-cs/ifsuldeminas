
package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    // Fazendo uma conexão com o Banco de Dados
    private Connection conexao; //Atributo que retém a conexao do com o BD
    protected String bdBase;
    
    // Construtor que define a base de dados
    protected DAO(String bdBase) {
        this.bdBase = bdBase;
    }
    
    // Método para privado conectar, que é utilizado por outros métodos públicos
    private void conectar () { // Faz uma conexao com o BD
        try { // Tenta fazer a conexao com o banco de dados
            Class.forName("com.mysql.jdbc.Driver"); 
			
			// Login e senha para o banco de dados dos computadores do IF
            String bdHost = "localhost:3306";
            String bdUser = "root"; 
            String bdPass = "ifsuldeminas";
			
			// Login e senha para o banco de dados do netbook do Rhian
            /*String bdHost = "192.168.0.125:3306";
            String bdUser = "desktop"; 
            String bdPass = "TrabalhoJavaHospital@@@123"; */
            
			// URL de conexão
            String url = "jdbc:mysql://"+bdHost+"/"+bdBase;
            conexao = DriverManager.getConnection(url, bdUser, bdPass);
            
            // Mostrar mensagens de sucesso ou erro
            if (conexao != null) {
                // Sucesso, nenhuma mensagem necessária
            } else {
                System.out.println("Conexão não estabelecida!");
            }
        } catch (Exception e) {
			// Caso qualquer exceção, mostrar mensagem
            System.out.println("Erro: "+e.getMessage( ));
        }
    }
    
    // Método privado que realiza uma consulta simples, que não retorna nada
    // É utilizado por outras classes
    private void consultaSimples(String consulta) {
        this.conectar(); // Conectar com o banco de dados
		
		// System.out.println(consulta); // Mostrando a consulta na tela
        try { // Tentar efetuar a consulta
			
            PreparedStatement instrucao;
            instrucao = conexao.prepareStatement(consulta);
            instrucao.executeUpdate();
            conexao.setAutoCommit(false); // Se todas instruções executadas são gravadas
        } catch (SQLException e ) {
            if (conexao != null) {
                try {
                    System.err.println("Rollback efetuado na transação!\n" + e.getMessage()) ;
                    conexao.rollback();
                } catch(SQLException e2) {
                    System.err.println("Erro na transação! \n" + e2.getMessage());
                }
            }
        }
    }
    
    // Método privado de consulta que retorna um Result Set, utilizado por outros métodos de seleções
    private ResultSet consultaSelecao(String consulta) {
        try {
            conectar(); // Conectar com o banco de dados
            Statement instrucao = conexao.createStatement(); 
            // System.out.println(consulta); // Mostrando a consulta na tela
            ResultSet dados = instrucao.executeQuery(consulta); // Executando a consulta
            return dados; // Retornando o ResultSet recebido
            
        } catch(SQLException e){
			// Caso qualquer erro, mostrar na tela
            System.out.println("Falha ao executar consulta (" + this.getClass() + ")");
        }
		// Retornar null caso qualquer erro
        return null;
    }
    
	// Método utilizado pelas subclasses, para seleção de dados COM condições adicionais
    protected  ResultSet selecionar(String tabela, String valores, String parametros) {
        return consultaSelecao("SELECT " + valores + " FROM " + tabela + " " + parametros);
    }
    
	// Método utilizado pelas subclasses, para seleção de dados SEM condições adicionais
    protected ResultSet selecionar(String tabela, String valores) {
        return selecionar(tabela, valores, "");
    }
    
	// Método utilizado pelas subclasses, para selecionar o maior valor de uma tabela
    protected ResultSet selecionarMaior(String tabela, String coluna) {
        return consultaSelecao("SELECT MAX(" + coluna + ") FROM " + tabela);
    }
	
	// Método utilizado pelas subclasses, para selecionar o a quantidade de valores de uma tabela
    protected ResultSet selecionarContagem(String tabela, String coluna) {
        return consultaSelecao("SELECT COUNT(" + coluna + ") FROM " + tabela);
    }
    
	// Método utilizado pelas subclasses, para inserir dados
    protected void inserir(String tabela, String valores) {
        consultaSimples("INSERT INTO " + tabela + " VALUES (" + valores + ");");
    }
    
	// Método utilizado pelas subclasses, para inserir dados especificado as tabelas desejadas
    protected void inserir(String tabela, String modo, String valores) {
        consultaSimples("INSERT INTO " + tabela + " (" + modo + ") VALUES (" + valores + ");");
    }
    
	// Método utilizado pelas subclasses, para deletar do banco de dados
    protected void deletar(String tabela, String parametros) {
        consultaSimples("DELETE FROM" + tabela + " " + parametros + ";");
    }
    
	// Método utilizado pelas subclasses, para atualizar no banco de dados especificando o Id
    protected void atualizar(String tabela, String parametros, String id) {
        consultaSimples("UPDATE " + tabela + " SET " + parametros + " WHERE id='" + id + "';");
    }
    
	// Método utilizado pelas subclasses, para verificar um id e uma senha no banco de dados 
	// especificando o Id, a Senha e o nome das colunas que guardam este
    protected boolean autenticar(String tabela, String colunaId, String colunaSenha, String id, String senha) {
        if (tabela.equals(null)) { // Se a tabela passada for nula, mostrar
            System.out.println("Erro: O valor da tabela é nulo. Verifique se a classe possui o atributo definido.");
        }
		
		// Obter um ResultSet da seleção deste dado
        ResultSet resultado = selecionar(tabela, colunaId +  ", " + colunaSenha, "WHERE " + colunaId + "='" + id + "'");
        
		// Tentar ver se o resultado possui algum dado
        try {
            if (resultado.next()) { // Se tiver algum dado
				
                // System.out.println("Id: " + resultado.getString("id") + "\nSenha: " + resultado.getString("senha"));
				
				// e se a senha especificada é igual à senha obtida
                if (resultado.getString(colunaSenha).equals(senha)) {
                    return true; // Login válido!
                }
				
            } else { // Caso não houver nenhum usuário com este nome
                System.out.println("resultado.next() retornou falso"); // Mostrar na tela que não houve resultado
                return false; // Login inválido
            }
        } catch(SQLException e) { // Caso qualquer exceção de SQL seja encontrada
			// Mostrar na tela
            System.out.println("SQLException encontrada!");
            e.printStackTrace();
        }
		
		// Para qualquer caso imprevisto, o login é inválido
        return false;
    }
	
	// Método especial para inserir o histórico, que recebe os parâmetros e uma BLOB do arquivo de exame
	protected void inserirHistoricoDePaciente(String tabela, String doenca, String data, String sintomas, String idPaciente, String idAtendente, String idMedico, File examePdf) {
		this.conectar(); // Conectar com o banco de dados
		String insercao = "INSERT INTO " + 
				tabela + 
				"(doenca, dataConsulta, sintomas, idPaciente, idAtendente, idMedico, examePdf) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
        try { // Tentar efetuar a consulta
            PreparedStatement instrucao;
            instrucao = conexao.prepareStatement(insercao); // Prepara este statement
			
			// Embutir os atributos de string
			instrucao.setString(1, doenca);
			instrucao.setString(2, data);
			instrucao.setString(3, sintomas);
			instrucao.setString(4, idPaciente);
			instrucao.setString(5, idAtendente);
			instrucao.setString(6, idMedico);
			
			try {
				// Se nenhum exame foi passado
				if(examePdf == null) {
					// Deixar como null
					instrucao.setString(7, "null");
				} else { // Caso contrário
					// Embutir os dados na BLOB
					instrucao.setBlob(7, new FileInputStream(examePdf));
				}
			// Para qualquer exceção, mostrar na tela os erros.
			} catch (FileNotFoundException fileNotFoundException) {
				System.out.println("Arquivo não encontrado.");
			} catch (SQLException sQLException) {
				System.out.println("Sql exception ao utilizar setBlob()");
			}
			
			// Efetuar a inserção
            instrucao.executeUpdate();
            conexao.setAutoCommit(false); // Se todas instruções executadas são gravadas
        } catch (SQLException e ) { // Caso qualquer erro, mostrar na tela
            if (conexao != null) {
                try {
                    System.err.println("Rollback efetuado na transação!\n" + e.getMessage());
                    conexao.rollback();
                } catch(SQLException e2) {
                    System.err.println("Erro na transação! \n" + e2.getMessage());
                }
            }
        }
	}
    
	// Método utilizado pelas subclasses, onde o nome da coluna de id e senha é "id" e "senha".
    protected boolean autenticar(String tabela, String id, String senha) {
        return autenticar(tabela, "id", "senha", id, senha);
    }
}
