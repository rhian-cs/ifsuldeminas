
import java.util.ArrayList;

public class Funcionario 
{
	private ArrayList<Medico>			listaFuncionariosMedicos;
	private ArrayList<Fisioterapeuta>	listaFuncionariosFisioterapeutas;
	private ArrayList<Enfermeiro>		listaFuncionariosEnfermeiros;
	
	//Construtor
	Funcionario()
	{
		listaFuncionariosMedicos			= new ArrayList<Medico>();
		listaFuncionariosFisioterapeutas	= new ArrayList<Fisioterapeuta>();
		listaFuncionariosEnfermeiros		= new ArrayList<Enfermeiro>();
		
	}
	
	public void addMedico(String nome, int idade, String sexo, double salario, int codCRM)
	{
		Medico medico = new Medico(nome, idade, sexo, salario, codCRM);
		listaFuncionariosMedicos.add(medico);
	}
	public void addFisioterapeuta(String nome, int idade, String sexo, double salario, int codCREFITO)
	{
		Medico medico = new Medico(nome, idade, sexo, salario, codCREFITO);
		listaFuncionariosMedicos.add(medico);
	}
	public void addEnfermeiro(String nome, int idade, String sexo, double salario, int codCOREN)
	{
		Medico medico = new Medico(nome, idade, sexo, salario, codCOREN);
		listaFuncionariosMedicos.add(medico);
	}
	
	public static void main(String args[])
	{
		Funcionario drhouse = new Funcionario();
		drhouse.addMedico("Gregory House", 58, "M", 375.0, 123);
		Hospital santalucia = new Hospital("Hospital Santa Lúcia", drhouse);
	}
}
