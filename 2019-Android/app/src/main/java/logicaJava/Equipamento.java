package logicaJava;

public class Equipamento {
	private String nome;
	private String caminhoImagem;
	
	public Equipamento(String nome, String caminhoImagem) {
		setNome(nome);
		setCaminhoImagem(caminhoImagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}
	
	
}
