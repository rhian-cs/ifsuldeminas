public class Diretor extends Funcionario {
	public Diretor(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*(10.0/100);
	}
}
