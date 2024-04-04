public class Pessoa
{
	//Atributos da classe
	private String	nome;
	private String	sexo;
	private int		idade;

	//SETTER e GETTER do NOME
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}

	//SETTER e GETTER do SEXO
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getSexo() {
			return sexo;
		}

	//SETTER e GETTER da IDADE
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getIdade() {
			return idade;
		}
	
	//Método para exibir as informações da pessoa
	public void mostrarPessoa() //O nome "exibir informações" é estranho então usei esse
	{
		System.out.println("NAME'S " + getNome());
		System.out.println("GENDER IS " + getSexo());
		System.out.println("IDADE É IGUAL AAAA " + getIdade());
	}
	
	//Construtor da classe
	public Pessoa(String nome, String sexo, int idade)
	{
		this.nome	=	nome;
		this.sexo	=	sexo;
		this.idade	=	idade;
	}
	
	public void metodoSecreto()
	{
		for(int i = 1; i <= 72; i++)
		{
			switch(i)
			{
				case 9:
					System.out.println("");
					break;
				case 18:
					System.out.println("");
					break;
				case 27:
					System.out.println("");
					break;
				case 36:
					System.out.println("");
					break;
				case 45:
					System.out.println("");
					break;
				case 54:
					System.out.println("");
					break;
				case 63:
					System.out.println("");
					break;
				case 72:
					System.out.println("");
					break;
				case 11:
					System.out.print('\u2588');
					break;
				case 12:
					System.out.print('\u2588');
					break;
				case 20:
					System.out.print('\u2588');
					break;
				case 21:
					System.out.print('\u2588');
					break;
				case 13:
					System.out.print('\u2588');
					break;
				case 14:
					System.out.print('\u2588');
					break;
				case 22:
					System.out.print('\u2588');
					break;
				default:
					System.out.print('\u2591');
					break;
			}
		}
	}
}
