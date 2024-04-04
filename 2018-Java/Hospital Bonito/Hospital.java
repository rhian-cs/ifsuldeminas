
import java.util.ArrayList;

public class Hospital
{
	//Divisão Bonita
	public void div()
	{
		System.out.println("----------------------------");
	}
	
	//ArrayList que contém a lista dos objetos da classe Funcionário
	ArrayList<Funcionario> listaDeFuncionarios;
	
	//Construtor da Classe Hospital
	public Hospital()
	{
		listaDeFuncionarios = new ArrayList();
	}
	
	public void addFuncionario(Funcionario novoFuncionario)
	{
		listaDeFuncionarios.add(novoFuncionario);
	}
	
	public void mostrarTodosFuncionarios()
	{
		div();
		for(int i = 0; i < listaDeFuncionarios.size(); i++)
		{
			listaDeFuncionarios.get(i).mostrarFuncionario();
			div();
		}
	}
}
