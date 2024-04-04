public class Celula
{
	//Declaração dos atributos
	double	tamanho;
	int		intervaloDeCrescimento;
	int		fatorDeCrescimento;

	//SETTER e GETTER do Tamanho
		public void setTamanho(double tamanho)
		{
			this.tamanho = tamanho;
		}
		public double getTamanho()
		{
			return tamanho;
		}

	//SETTER e GETTER do Intervalo de Crescimento
		public void setIntervaloDeCrescimento(int intervaloDeCrescimento)
		{
			this.intervaloDeCrescimento = intervaloDeCrescimento;
		}
		public int getIntervaloDeCrescimento()
		{
			return intervaloDeCrescimento;
		}

	//SETTER e GETTER do Fator De Crescimento
		public void setFatorDeCrescimento(int fatorDeCrescimento)
		{
			this.fatorDeCrescimento = fatorDeCrescimento;
		}
		public int getFatorDeCrescimento()
		{
			return fatorDeCrescimento;
		}

	Celula(double tamanho, int intervaloDeCrescimento, int fatorDeCrescimento)
	{
		this.tamanho = tamanho;
		this.intervaloDeCrescimento = intervaloDeCrescimento;
		this.fatorDeCrescimento = fatorDeCrescimento;
	}
	
	public void Crescer(int ateQuando)
	{
		
	}
}
