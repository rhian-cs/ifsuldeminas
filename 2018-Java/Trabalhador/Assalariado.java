public class Assalariado extends Trabalhador {
	public double salario; // Salário Mensal
	
	//Construtor
	public Assalariado(String nome, String cpf, double salario) {
		super(nome,cpf);
		this.salario = salario;
	}
	
	//Sobrescrevendo os métodos
	@Override
	public void exibirSalarioMensal() {
		System.out.println("O salário mensal de " + this.nome + "(CPF " + this.cpf + ") é de R$" + this.salario);
	}
	
	@Override
	public void exibirSalarioAnual() {
		System.out.println("O salário anual de " + this.nome + "(CPF " + this.cpf + ") é de R$" + this.salario*12);
	}
}
