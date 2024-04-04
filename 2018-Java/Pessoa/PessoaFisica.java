public class PessoaFisica extends Pessoa
{
	int codCPF;

	public void setCodCPF(int novoCPF)
	{
		this.codCPF = novoCPF;
	}
	public int getCodCPF()
	{
		return codCPF;
	}
	
	//Construtor da Classe
	public PessoaFisica(String nome, String sexo, int idade, int codCPF)
	{
		super(nome, sexo, idade);
		this.codCPF = codCPF;
	}
	
	//Método que herda o método mostrarPessoa e ainda mostra o CPF
	public void mostrarPessoa()
	{
		super.mostrarPessoa();
		System.out.println("CPF = " + getCodCPF());
	}
}
