package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDAO extends DAO {
    private String id;
    
    private String nome;
    private String email;
    // private String cpf;
    
    private String cep;

    private String bairro;
    private String rua;
    private String numero;
    private String cidade;
    private String nacionalidade;
    
    private String senha;
    
    private boolean contratado;
    
    protected String prefixoTipoLogin = null;
    
    protected String tabela;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
	// Construtor vazio da classe
    public PessoaDAO() {
        super("hospital");
    }
    
	// Construtor completo da classe
    public PessoaDAO(String nome, String email, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        this();
        this.atualizarTudo(nome, email, cep, bairro, rua, numero, cidade, nacionalidade, senha);
    }
    
	// Método para atualizar um objeto
    protected void atualizarTudo(String nome, String email, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha) {
        this.nome = nome;
        this.email = email;

        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.nacionalidade = nacionalidade;

        this.senha = senha;
    }
    
	// Método para selecionar as pessoas disponíveis no hospital
    public ResultSet selecionarContratados() {
        return selecionar(tabela, "*", "WHERE contratado=true");
    }
    
	// Método que seleciona uma pessoa por seu Id
    public ResultSet selecionarPorId(String id) {
        return selecionar(tabela, "*", "WHERE id='" + id + "'");
    }
    
	// Método que seleciona todas as pessoas, independente delas estarem ou não no hospital
    public ResultSet selecionarTodos() {
        return selecionar(tabela, "*");
    }
    
	// Método que seleciona o maior valor de uma coluna
    public ResultSet selecionarMaior(String coluna) {
        return selecionarMaior(this.tabela, coluna);
    }
	
	// Método que seleciona a quantidade de tuplas de uma coluna
    public ResultSet selecionarContagem(String coluna) {
        return selecionarContagem(this.tabela, coluna);
    }
    
	// Método que gera um novo Id de login para inserir no banco de dados
    public String novoLogin() throws SQLException, Exception {
        ResultSet resultadoSelecao;
        switch(prefixoTipoLogin) {
            case "M":
                resultadoSelecao = new MedicoDAO().selecionarContagem("id");
                break;
            case "A":
                resultadoSelecao = new AtendenteDAO().selecionarContagem("id");
                break;
            case "P":
                // resultadoSelecao = new PacienteDAO().selecionarMaior("paciente", "nome");
                resultadoSelecao = new PacienteDAO().selecionarContagem("id");
                break;
            default:
				// Em caso de erro, mostrar na tela.
                throw new Exception("Erro ao criar novo id de login: prefixo de login inválido. Prefixo especificado: " + prefixoTipoLogin);
        }
        int novoId = 0;
        if (resultadoSelecao.next()) {
            int id = resultadoSelecao.getInt("count(id)");
            novoId = id + 1;
        }
        return prefixoTipoLogin + novoId;
    }
    
	// Método para adicionar no banco de dados
    public String create(String codEspecial, String nomeTabelaCodEspecial) throws Exception {
		String id = novoLogin();
		
		String insercao = "'" + id + "', '" + nome+ "', '" +email+ "', '" +codEspecial+"', '" +cep+ "', '" +bairro+ "', '" +rua+ "', '" +numero+ "', '" +cidade+ "', '" +nacionalidade+ "', '" +senha + "', true";
        inserir(tabela, insercao);
		return id;
    }
    
	// Método para atualizar no banco de dados
    public void update(String codEspecial, String nomeTabelaCodEspecial) {
        atualizar(tabela, "nome='" + nome+ "', email='" +email+ "', " + nomeTabelaCodEspecial + "='" +codEspecial+"', cep='" +cep+ "', bairro='" +bairro+ "', rua='" +rua+ "', numero='" +numero+ "', cidade='" +cidade+ "', nacionalidade='" +nacionalidade+ "', senha='" +senha + "'", id);
    }
    
	// Método para excluir permanentemente no banco de dados
    public void delete() {
        this.deletar(tabela, "WHERE id='" + this.id + "';");
    }
    
	// Método para autenticar no banco de dados
    public boolean autenticar(String id, String senha) {
        return autenticar(tabela, id, senha);
    }
    
	// Método para demitir do banco de dados
    public void demitir() {
        atualizar(tabela, "contratado=false", id);
    }
    
	// Método para recontratar no banco de dados
    public void recontratar() {
        atualizar(tabela, "contratado=true", id);
    }
}