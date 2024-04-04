public class Fisioterapeuta extends Funcionario
{
	//Atributo específico do Fisioterapeuta
	private int codCREFITO;
	
	//Construtor da classe
	public Fisioterapeuta(String nome, String sexo, int idade, double salario, int codCREFITO)
	{
		super(nome, sexo, idade, salario);
		this.codCREFITO = codCREFITO;
	}
	
	//Método que herda o método MostrarFuncionario e ainda mostra o Código especial (No caso, CREFITO)
	public void mostrarFuncionario()
	{
		super.mostrarFuncionario();
		System.out.println("Código CREFITO = " + codCREFITO);
	}
}
