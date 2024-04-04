public class Matriz {
	private int nLinhasColunas;
	private int[][] elementos;
	
	public Matriz(int n){
		//Inicialização dos atributos
		this.nLinhasColunas = n;
		elementos = new int[n][n];
		for(int i = 0; i < elementos.length; i++)
		{
			for(int j = 0; j < elementos.length; j++)
			{
				elementos[i][j] = 0;
				if(i == j)
				{
					elementos[i][j] = 1;
				}
				if(j + i == elementos.length - 1) // Fazendo um X :D
				{
					elementos[i][j] = 1;
				}
			}
		}
	}
	public void mostrarMatriz(String verificarTransposta)
	{
		for(int i = 0; i < elementos.length; i++)
		{
			for(int j = 0; j < elementos.length; j++)
			{
				if(verificarTransposta == "transposta")
				{
					if(elementos[j][i] == 1)
					{
						System.out.print('\u2588');
					}
					else
					{
						System.out.print('\u2591');
					}
				}
				else
				{
					if(elementos[i][j] == 1)
					{
						System.out.print('\u2588');
					}
					else
					{
						System.out.print('\u2591');
					}
				}
			}
			System.out.println(""); //Pulando um a linha feliz
		}
	}
	
	public void setElementoMatriz(int i, int j, int valor)
	{
		elementos[i][j] = valor;
	}
	
	public int getElementoMatriz(int i, int j)
	{
		int valor = elementos[i][j];
		return valor;
	}
	
	public void subtrairMatriz(int subtrair)
	{
		for(int i = 0; i < elementos.length; i++)
		{
			for(int j = 0; j < elementos.length; j++)
			{
				elementos[i][j] -= subtrair;
			}
		}
	}
			
	public static void main(String args[])
	{
		Matriz matrix = new Matriz(5);
		matrix.setElementoMatriz(2,3,1);
		matrix.mostrarMatriz(""); //Matriz normal
		System.out.println("------------------");//Separando as exibições
		matrix.mostrarMatriz("transposta"); //Matriz transposta
		System.out.println("------------------");//Separando as exibições
		matrix.subtrairMatriz(1); //Subtraindo a matriz
		matrix.mostrarMatriz(""); //Matriz normal após a subtração
	}
}
