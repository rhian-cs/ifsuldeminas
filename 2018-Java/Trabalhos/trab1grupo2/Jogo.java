public class Jogo
{
    private String  nome;                   //Nome do Jogo
    private double  preco;                  //Preço do aluguel do jogo
    private boolean locacaoCondicaoAlugado; //Condição atual da locação. True = Está sendo alugado. False = Está disponível.
    private int     locacaoTempoLocacao;  //Qual o prazo de devolução por esta locação. Este atributo será nulo se o jogo não estiver sendo alugado.
    private String	locacaoNomeLocador;		//Nome da pessoa que realizou a locação do jogo. Este atributo será nulo se o jogo não estiver sendo alugado.
	
	//Construtor, que cria o jogo e o coloca inicialmente como "disponível" (ninguém o alugou ainda)
	Jogo(String nome, double preco)
	{
		this.nome						= nome;
		this.preco						= preco;
		this.locacaoCondicaoAlugado		= false;
	}
	
	//SETTER e GETTER do atributo NOME
		public void setNome(String novoNome)
		{
			this.nome = novoNome;
		}
		
		public String getNome()
		{
			return this.nome;
		}

	//SETTER e GETTER do atributo PREÇO
		public void setPreco(double novoPreco)
		{
			this.preco = novoPreco;
		}
		
		public double getPreco()
		{
			return preco;
		}
		
	//SETTER e GETTER do atributo CONDIÇÃO DE LOCAÇÃO (locacaoCondicaoAlugado)
		public void setLocacaoCondicaoAlugado(boolean locacaoCondicaoAlugadoNova)
		{
			this.locacaoCondicaoAlugado = locacaoCondicaoAlugadoNova;
		}
		
		public boolean getLocacaoCondicaoAlugado()
		{
			return locacaoCondicaoAlugado;
		}
		
	//SETTER e GETTER do atributo PRAZO DE DEVOLUÇÃO (prazoDevolucao)
		public void setLocacaoTempoLocacao(int locacaoPrazoDevolucaoNovo)
		{
			this.locacaoTempoLocacao = locacaoPrazoDevolucaoNovo;
		}
		
		public int getLocacaoTempoLocacao()
		{
			return locacaoTempoLocacao;
		}
		
	//SETTER e GETTER do atributo NOME DO LOCADOR (locacaoNomeLocador)
		public void setLocacaoNomeLocador(String novoNomeLocador)
		{
			this.locacaoNomeLocador = novoNomeLocador;
		}
		
		public String getLocacaoNomeLocador()
		{
			return locacaoNomeLocador;
		}
		
	public void alugar(String nomeLocador, int tempoLocacao) //Método usado para definir que um jogo foi alugado, Recebe como parâmetro o nome do locador do jogo e o tempo de locação.
	{
		if(getLocacaoCondicaoAlugado() == true)
		{
			System.out.println("ERRO: O jogo já está sendo alugado.");
		}
		else
		{
			setLocacaoNomeLocador(nomeLocador);
			setLocacaoTempoLocacao(tempoLocacao);
			setLocacaoCondicaoAlugado(true);
		}
	}	
        
	public void devolver() //Método usado para definir que um jogo alugado esta sendo devolvido.
	{
		if(getLocacaoCondicaoAlugado() == true)
		{
			setLocacaoNomeLocador(null);
			setLocacaoCondicaoAlugado(false);
			System.out.println("Deverão ser pagos R$" + getPreco() + ".");
		}
		else
		{
			System.out.println("ERRO: O jogo não está sendo alugado.");
		}
	}
}