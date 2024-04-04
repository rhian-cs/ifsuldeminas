public class ContaBancariaSimples extends ContaBancaria {
	public ContaBancariaSimples(String nome) {
		this.nomeDoCorrentista = nome;
		this.saldo = 0;
		this.isContaEspecial = false;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println(this.nomeDoCorrentista + " possui uma conta com R$" + this.saldo);
	}
}
