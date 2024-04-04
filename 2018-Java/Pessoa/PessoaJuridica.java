public class PessoaJuridica extends Pessoa
{
	int codCNPJ;

	public void setCodCNPJ(int novoCNPJ)
	{
		this.codCNPJ = novoCNPJ;
	}
	public int getCodCNPJ()
	{
		return codCNPJ;
	}
	
	//Construtor da Classe
	public PessoaJuridica(String nome, String sexo, int idade, int codCNPJ)
	{
		super(nome, sexo, idade);
		this.codCNPJ = codCNPJ;
	}
	
	//Método que herda o método mostrarPessoa e ainda mostra o CPF
	public void mostrarPessoa()
	{
		super.mostrarPessoa();
		System.out.println("CNPJ = " + getCodCNPJ());
	}
}
