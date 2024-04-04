
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AtendenteDAO extends PessoaDAO {

	// CPF é um atributo do Atendente que nem toda pessoa deve ter
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
	// Método para atualizar todos os dados deste objeto
    public void atualizarTudo(String nome, String email, String cpf, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        atualizarTudo(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        setCpf(cpf);
    }
    
	// Método que cria um Atendente de atributos definidos no banco de dados
    public String create() throws Exception {
        return create(cpf, "cpf");
    }
    
	// Método para atualizar o paciente cujos atributos já estejam definidos
    public void update() {
        update(cpf, "cpf");
    }
    
	// Construtor vazio da classe
    public AtendenteDAO() {
        this.tabela = "atendente";
        prefixoTipoLogin = "A";
    }
    
	// Construtor completo da classe
    public AtendenteDAO(String nome, String email, String cpf, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        super(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        this.tabela = "atendente";
        prefixoTipoLogin = "A";
        this.cpf = cpf;
    }
    
	// Método para obter um Atendente pelo id
    public static AtendenteDAO getAtendentePorId(String id) {
        try {
            try {
                ResultSet dados = new AtendenteDAO().selecionarPorId(id.toUpperCase());
                if (dados.next()) {
                    String nome = dados.getString("nome");
                    String email = dados.getString("email");
                    String cpf = dados.getString("cpf");
                    String cep = dados.getString("cep");
                    String bairro = dados.getString("bairro");
                    String rua = dados.getString("rua");
                    String numero = dados.getString("numero");
                    String cidade = dados.getString("cidade");
                    String nacionalidade = dados.getString("nacionalidade");
                    String senha = dados.getString("senha");
                    AtendenteDAO atendente = new AtendenteDAO(nome, email, cpf, cep, bairro, rua, numero, cidade, nacionalidade, senha);
                    atendente.setId(id);
                    return atendente; 
                } else {
                    System.out.println("Atendente não encontrado.");
                }

            } catch(SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Erro ao retornar. Retornando null");
            return null;
        } catch(NullPointerException er) {
            System.out.println("Atendente nulo.");
            return null;
        }
    }
    
	// Método para autenticar um atendente cujo Id já esteja definido
	// Este método existe para caso de demissão
    public boolean autenticar(String senhaDoUsuario) {
        if (this.getId().length() > 0 && senhaDoUsuario.length() > 0) {
            String prefixoDoIdEspecificado = this.getId().substring(0, 1);
            if (!prefixoDoIdEspecificado.equals(prefixoTipoLogin)) {
                System.out.println("Prefixo inválido");
                return false;
            }
            boolean resultado = autenticar(tabela, this.getId(), senhaDoUsuario);
            return resultado;
        }
        System.out.println("Entrada muito pequena");
        return false;
    }
}
