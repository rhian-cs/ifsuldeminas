
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteDAO extends PessoaDAO {
    
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
    
	// Método que cria um Paciente de atributos definidos no banco de dados
    public String create() throws Exception {
        return create(cpf, "cpf");
    }
    
	// Método para atualizar o paciente cujos atributos já estejam definidos
    public void update() {
        update(cpf, "cpf");
    }
    
	// Construtor vazio da classe
    public PacienteDAO() {
        this.tabela = "paciente";
        prefixoTipoLogin = "P";
    }
    
	// Construtor completo da classe
    public PacienteDAO(String nome, String email, String cpf, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        super(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        this.tabela = "paciente";
        prefixoTipoLogin = "P";
        this.cpf = cpf;
    }
    
	// Método para obter um Paciente pelo id
    public static PacienteDAO getPacientePorId(String id) {
        try {
            ResultSet dados = new PacienteDAO().selecionarPorId(id.toUpperCase());
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
                PacienteDAO paciente = new PacienteDAO(nome, email, cpf, cep, bairro, rua, numero, cidade, nacionalidade, senha);
                paciente.setId(id);
                return paciente; 
            } else {
                System.out.println("Paciente não encontrado.");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
