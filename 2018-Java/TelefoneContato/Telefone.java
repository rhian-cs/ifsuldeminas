
import java.util.ArrayList;
import java.util.Scanner;

public class Telefone 
{
    private Contato contatos[]; //Armazena os contatos de um Telefone
	private ArrayList<Contato> contatoss;
	
    public Telefone() //Construtor da classe Telefone
    {
		contatos = new Contato[1024];
		contatoss = new ArrayList();
    }
	
	//Método para adicionar um novo contato
	public void addContato(String nome, int telefone)
	{
		//Laço para verificar se não há nenhum outro contato com o mesmo número de telefone.
		for(int i = 0; i < contatoss.size(); i++)
		{
			if(contatoss.get(i) != null)
			{
				if(contatoss.get(i).getTelefone() == telefone)
				{
					System.out.println("Sinto muito, mas o número atual já está sendo utilizado. Tente novamente");
					break;
				}
			}
		}
		/* Laço For que procura um espaço para contato vazio, para então criar um novo contato, 
		e com isso, não sobrepor outros contatos. */
		/* Este laço só será executado se no laço anterior não for encontrado nenhum número de 
		telefone igual ao fornecido nos parâmetros. */
		for(int j = 0; j < contatoss.size(); j++)
		{
			if(contatoss.get(j) == null)
			{
				//Criar um contato com os parâmetros deste método
				Contato novoContato = new Contato(nome, telefone);
				//Criar um contato no vetor dos contatos
				contatoss.add(novoContato);
				break;
			}
		}
	}
	
	//Método para remover um contato, recebe como parâmetro o número de telefone do contato que deve ser deletado
	public void removeContato(int telefoneContato)
	{
		for(int i = 0; i < contatoss.size(); i++)
		{
			/* Verificando se o contato não é null, pois contatos null (não existentes)
			não possuem atributos, impossibilitando a comparação*/
			if(contatoss.get(i) != null)
			{
				//Comparando o telefone de cada contato com o telefoneContato
				if(contatoss.get(i).getTelefone() == telefoneContato)
				{
					contatoss.remove(i);
					break; //Por que não?
				}
			}
		}
	}
	
	//Método que mostra todos os contatos
	public void mostrarTodosContatos()
	{
		System.out.println("Contatos: ");
		//Laço que percorre todo o vetor em busca de contatos existentes
		for(int i = 0; i < contatoss.size(); i++)
		{
			//Se existir um contato neste local, mostrar suas informações.
			if(contatoss.get(i) != null)
			{
				contatoss.get(i).mostrarContato();
			}
			//Se não existir um contato nessa posição, parar o laço inteiro.
			else
			{
				break;
			}
		}
	}

	//Método Principal
    public static void main(String args[])
    {
		//Declaração de variáveis
		Scanner inpt = new Scanner(System.in); //Variável do tipo Scanner que armazena entradas do usuário
		Telefone tel = new Telefone(); //Criando um novo Telefone
		
		//Criando alguns contatos
		tel.addContato("Antonio", 932823);
		tel.addContato("Josevélvia", 666555);
		tel.addContato("Irineu",555123);
		tel.removeContato(555123);
		
		//Mostrar os contatos na tela
		tel.mostrarTodosContatos();
	}
}
