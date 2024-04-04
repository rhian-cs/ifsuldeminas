
import java.util.ArrayList;
import java.util.Collections;

public class Poligono 
{
	//Criação do Atributo Lados
	private ArrayList<Double> tamLados;
	
	//Construtor vazio
	Poligono()
	{
		tamLados = new ArrayList();
	}
	
	//Método que retorna a quantidade de lados do polígono
	public int getNumLados()
	{
		return(tamLados.size());
	}
	
	/* Método que adiciona um lado ao polígono. Recebe como parâmetro o tamanho deste lado.
	Este método existe pois 'tamLados' é um atributo privado. */
	public void addLado(double tamanho)
	{
		tamLados.add(tamanho);
	}
	
	//Método que retorna o perímetro do polígono através da soma de todos os lados.
	public double getPerimetro()
	{
		double perimetro = 0.0;
		for(int i = 0; i < tamLados.size(); i++)
		{
			perimetro += tamLados.get(i);
		}
		return perimetro;
	}
	
	//Método que retorna o maior lado do polígono
	public double getMaiorLado()
	{
		double maiorLado = 0.0;
		boolean maiorLadoInicial = false; //Variável que é verdadeira se o maiorLado já foi comparado com outra variável ... não sei explicar :(
		for(int i = 0; i < tamLados.size(); i++)
		{
			if(maiorLadoInicial == true)
			{
				if(tamLados.get(i) > maiorLado)
				{
					maiorLado = tamLados.get(i);
				}
			}
			else
			{
				maiorLado = tamLados.get(i);
			}
		}
		return(maiorLado);
	}
	
	//Método que verifica se o polígono tem ou não todos os seus lados iguais
	public boolean TemLadosIguais()
	{
		boolean ladosIguais = true; //
		double tamLadoAnterior = 0.0; //Valor impossível para um polígono
		for(int i = 0; i < tamLados.size(); i++)
		{
			if(tamLados.get(i) != tamLadoAnterior)
			{
				ladosIguais = false;
				break; //Se algum lado for diferente, não é necessário comparar com os outros lados.
			}
			//Se todos os lados são iguais, o IF não fará nada, porém 'ladosIguais' já é verdadeiro, e é assim que será retornado.
		}
		return(ladosIguais);
	}
	
	//Método que calcula quantas diagonais o polígono tem
	public int getNumDiagonais()
	{
		int numDiagonais = (tamLados.size()*(tamLados.size()*3))/2; //Fórmula by https://brasilescola.uol.com.br/matematica/numero-diagonais-um-poligono-convexo.htm
		return numDiagonais;
	}
	
	//Método que organiza os lados do polígono na ordem decrescente e retorna outro ArrayList
	public ArrayList getTamLadosDecrescente()
	{
		ArrayList<Double> tamLadosDecrescente = tamLados;
		Collections.sort(tamLadosDecrescente, Collections.reverseOrder());
		return tamLadosDecrescente;
	}
	
	//Método que chama os métodos acima e os mostra na tela.
	public void getInfo(String nome)
	{
		//Mostrando o perímetro na tela
		System.out.println("Perímetro do " + nome + " = " + getPerimetro());
		
		//Verificando se os lados são iguais
		if(TemLadosIguais())
		{
			//Mostrando na tela se for verdadeiro (tem os lados iguais)
			System.out.println("O " + nome + " TEM todos os lados do mesmo tamanho.");
		}
		else
		{
			//Mostrando na tela se for falso (não tem os lados iguais)
			System.out.println("O " + nome + " NÃO TEM todos os lados do mesmo tamanho.");
		}
		
		System.out.println("O maior lado do " + nome + " é o " + getMaiorLado());
		
		//Mostrando na ordem decrescente.
		System.out.print("Os lados do " + nome + " na ordem decrescente são ");
		ArrayList ordemDecrescente = getTamLadosDecrescente();
		for(int i = 0; i < tamLados.size(); i++)
		{
			if(i == tamLados.size()-1)
			{
				System.out.print("e ");
			}
			System.out.print(ordemDecrescente.get(i));
			if(i != tamLados.size()-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(".");
	}
	
	//Método principal
	public static void main(String args[])
	{
		Poligono rhianlatero = new Poligono(); //Criando um polígono
		
		//Adicionando os três lados
		rhianlatero.addLado(16);
		rhianlatero.addLado(69);
		rhianlatero.addLado(34);
		rhianlatero.getInfo("Rhianlátero"); //Mostrando na tela
		
		System.out.println("");//Pulando uma linha
		
		rhianlatero.addLado(2);//Adicionando um novo lado.
		rhianlatero.getInfo("Rhianlátero"); //Mostrando na tela
	}
}
