public class Horista extends Trabalhador{
	public double salarioPorHora;
	public int horasSemanais;
	
	// Construtor
	public Horista(String nome, String cpf, double salarioPorHora, int horasSemanais) {
		super(nome,cpf);
		this.salarioPorHora = salarioPorHora;
		this.horasSemanais = horasSemanais;
	}
	
	//Sobreescrevendo os métodos
	@Override
	public void exibirSalarioMensal() {
		System.out.println("O salário mensal de " + this.nome + "(CPF " + this.cpf + ") é de R$" + this.salarioPorHora*horasSemanais*4);
	}
	
	@Override
	public void exibirSalarioAnual() {
		System.out.println("O salário anual de " + this.nome + "(CPF " + this.cpf + ") é de R$" + this.salarioPorHora*horasSemanais*4*12);
	}
}
