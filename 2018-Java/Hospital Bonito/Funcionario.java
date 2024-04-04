public class Funcionario 
{
	//Atributos da classe Funcionario, que todo funcionário deve ter.
	private String	nome;
	private String	sexo;
	private int		idade;
	private double	salario;
	
	//Construtor do Funcionário
	Funcionario(String nome, String sexo, int idade, double salario)
	{
		
		this.nome		= nome;
		this.sexo		= sexo;
		this.idade		= idade;
		this.salario	= salario;
	}
	
	//Método para mostrar os atributos de um Funcionario.
	public void mostrarFuncionario()
	{
		System.out.println("Informações do Funcionário:");
		System.out.println("Nome = " + nome);
		System.out.println("Sexo = " + sexo);
		System.out.println("Idade = " + idade);
		System.out.println("Salario = " + salario);
	}
	
	//SETTER e GETTER do atributo NOME
		public void setNome(String nome)
		{
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
	
	//SETTER e GETTER do atributo SEXO
		public void setSexo(String sexo)
		{
			this.sexo = sexo;
		}
		public String getSexo()
		{
			return sexo;
		}

	//SETTER e GETTER do atributo IDADE
		public void setIdade(int idade)
		{
			this.idade = idade;
		}
		public int getIdade()
		{
			return idade;
		}

	//SETTER e GETTER do atributo SALARIO
		public void setSalario(double salario)
		{
			this.salario = salario;
		}
		public double getSalario()
		{
			return salario;
		}
}
