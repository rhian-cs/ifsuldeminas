// Classe para representar uma pessoa
public class Pessoa {
	// Declaração de Parâmetros
	private String nome;
	private int idade; 
	private double altura;
	private char sexo;
	
	public boolean erro; // Se este atributo for verdadeiro, então significa que este objeto passou por erros durante sua construção ou alteração
	
	public Pessoa() {
		this.setNome(Interface.perguntaComEntrada("Digite seu nome:"));
		this.setIdade(Integer.parseInt(Interface.perguntaComEntrada("Digite sua idade:")));
		this.setAltura(Double.parseDouble(Interface.perguntaComEntrada("Qual sua altura (em metros)?")));
		switch(Interface.perguntaComOpcoes("Qual seu sexo?", "Masculino", "Feminino")) {
			case 0:
				this.sexo = 'M';
				break;
			case 1:
				this.sexo = 'F';
				break;
		}
		if(this.erro) {
			Interface.mensagemDeErro("Este objeto possui erros e portanto não deve ser utilizado.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.isEmpty()) { // Se o nome estiver vazio
			// Mostrar um erro
			this.erro = true;
			Interface.mensagemDeErro("O campo do nome não pode estar vazio");
		} else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade < 0) { // Se a idade for negativa
			// Mostrar um erro
			this.erro = true;
			Interface.mensagemDeErro("A idade não pode ser negativa");
		} else {
			this.idade = idade;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura < 0) { // Se a altura for negativa
			// Mostrar um erro
			this.erro = true;
			Interface.mensagemDeErro("A altura não pode ser negativa");
		} else {
		this.altura = altura;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		switch((sexo + "").toUpperCase()) {
			case 'M' + "":
			case 'F' + "":
				this.sexo = sexo;
				break;
			default:
				this.erro = true;
				Interface.mensagemDeErro("Sexo inválido");
				break;
		}
	}
	
	// Mostra os atributos desta pessoa
	public void mostrar() {
		Interface.mensagem("A pessoa " + this.nome + " (" + this.sexo + ") tem " + this.idade + " anos e " + this.altura + "m de altura.");
	}
	
	// Método main das questões de 1 até 3
	public static void main(String[] args) {
		Pessoa pessoinha = new Pessoa();
		pessoinha.mostrar();
	}
}