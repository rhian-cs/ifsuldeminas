public abstract class Trabalhador {
	
	// Atributos
	public String nome;
	public String cpf; // O exercício pediu CPF como String
	
	// Construtor
	public Trabalhador(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Declaração de Métodos Abstratos
	public abstract void exibirSalarioMensal();
	public abstract void exibirSalarioAnual();
	
	public static void main(String[] args) {
		//Criando os objetos
		Assalariado ass = new Assalariado("Jeaule", "3469", 700);
		Horista houry = new Horista("Tesliane", "2460", 5, 30);
		
		//Chamando os métodos do Jeaule
		ass.exibirSalarioMensal();
		ass.exibirSalarioAnual();
		
		//Chamando os métodos da Tesliane
		houry.exibirSalarioMensal();
		houry.exibirSalarioAnual();
	}
}
