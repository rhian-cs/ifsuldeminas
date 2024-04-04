
// Classe Pessoa
public class Pessoa {
	// Atributos: Nome e Idade
	private String nome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	// Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
