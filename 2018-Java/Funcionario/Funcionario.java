public class Funcionario {
	private String nome;
	private double salario;
	
	// Construtor
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Método que retorna a bonificação do funcionário, método sobrescrito nas subclasses
	public double getBonificacao() {
		return 0;
	}
	
	public void exibirFuncionario() {
		System.out.println("O funcionário " + this.getNome() + " possui um salário de R$" + this.getSalario() + " e uma bonificação de R$" + this.getBonificacao() + ".");
	}
	
	// Método main para os exercícios 1 até 3
	public static void main(String[] args) {
		Funcionario[] funcs = new Funcionario[2];
		funcs[0] = new Gerente("Josevélvia", 2000);
		funcs[1] = new Diretor("Lucas", 2000);
		
		for(Funcionario funcionario : funcs) {
			funcionario.exibirFuncionario();
		}
	}
}
