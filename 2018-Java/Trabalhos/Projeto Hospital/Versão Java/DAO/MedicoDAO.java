
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoDAO extends PessoaDAO {
	
	// CPF é um atributo do Atendente que nem toda pessoa deve ter
    public String crm;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
	// Método para atualizar todos os dados deste objeto
    public void atualizarTudo(String nome, String email, String crm, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        atualizarTudo(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        setCrm(crm);
    }
    
	// Método que cria um Médico de atributos definidos no banco de dados
    public String create() throws Exception {
        return create(crm, "crm");
    }
    
	// Método para atualizar o Médico cujos atributos já estejam definidos
    public void update() {
        update(crm, "crm");
    }
    
	// Construtor vazio da classe
    public MedicoDAO() {
        this.tabela = "medico";
        prefixoTipoLogin = "M";
    }
    
	// Construtor completo da classe
    public MedicoDAO(String nome, String email, String crm, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        super(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        this.tabela = "medico";
        prefixoTipoLogin = "M";
        this.crm = crm;
    }
	
	// Método para obter um Médico pelo id
	public static MedicoDAO getMedicoPorId(String id) {
        try {
            ResultSet dados = new MedicoDAO().selecionarPorId(id.toUpperCase());
            if (dados.next()) {
                String nome = dados.getString("nome");
                String email = dados.getString("email");
                String crm = dados.getString("crm");
                String cep = dados.getString("cep");
                String bairro = dados.getString("bairro");
                String rua = dados.getString("rua");
                String numero = dados.getString("numero");
                String cidade = dados.getString("cidade");
                String nacionalidade = dados.getString("nacionalidade");
                String senha = dados.getString("senha");
                MedicoDAO medico = new MedicoDAO(nome, email, crm, cep, bairro, rua, numero, cidade, nacionalidade, senha);
                medico.setId(id);
                return medico; 
            } else {
                System.out.println("Atendente não encontrado.");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
