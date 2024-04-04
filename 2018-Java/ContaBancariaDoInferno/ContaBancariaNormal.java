public class ContaBancariaNormal extends ContaBancaria {
	public ContaBancariaNormal(String nome, double depositoInicial, boolean isContaEspecial) {
		this.nomeDoCorrentista = nome;
		this.saldo = depositoInicial;
		this.isContaEspecial = isContaEspecial;
	}
	
	@Override
	public void mostrarDados() {
		System.out.print(this.nomeDoCorrentista + " possui uma conta ");
		if(this.isContaEspecial) {
			System.out.print("especial ");
		}
		System.out.println("com R$" + this.saldo);
	}
}
