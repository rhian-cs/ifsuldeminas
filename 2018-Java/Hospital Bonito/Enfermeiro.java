public class Enfermeiro extends Funcionario
{
	//Atributo específico do médico
	private int codCOREN;
	
	//Construtor do Médico
	public Enfermeiro(String nome, String sexo, int idade, double salario, int codCOREN)
	{
		super(nome, sexo, idade, salario);
		this.codCOREN = codCOREN;
	}
	
	//Método que herda o método MostrarFuncionario e ainda mostra o Código especial (No caso, CRM)
	public void mostrarFuncionario()
	{
		super.mostrarFuncionario();
		System.out.println("Código COREN = " + codCOREN);
	}
}
