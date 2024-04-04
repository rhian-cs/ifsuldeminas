public class Medico extends Funcionario
{
	//Atributo específico do médico
	private int codCRM;
	
	//Construtor do Médico
	public Medico(String nome, String sexo, int idade, double salario, int codCRM)
	{
		super(nome, sexo, idade, salario);
		this.codCRM = codCRM;
	}
	
	//Método que herda o método MostrarFuncionario e ainda mostra o Código especial (No caso, CRM)
	public void mostrarFuncionario()
	{
		super.mostrarFuncionario();
		System.out.println("Código CRM = " + codCRM);
	}
}
