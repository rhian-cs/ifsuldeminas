public class MainMethod
{
	public static void main(String args[])
	{
		PessoaFisica jaozin = new PessoaFisica("Jãozinho Feliz", "M", 16, 455);
		PessoaJuridica sidneu = new PessoaJuridica("Sidneu Araújo Mendes da Silva Ferreira Euler", "M", 49, 949);
		jaozin.mostrarPessoa();
		sidneu.mostrarPessoa();
		sidneu.metodoSecreto();
	}
}
