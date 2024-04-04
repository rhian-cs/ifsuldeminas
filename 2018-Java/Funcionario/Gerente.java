public class Gerente extends Funcionario {
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*(5.0/100);
	}
}
