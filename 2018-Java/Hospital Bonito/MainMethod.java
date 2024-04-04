public class MainMethod 
{
	public static void main(String args[])
	{
		Hospital hospital = new Hospital();
		Medico gandalf = new Medico("Gandalf", "M", 342, 19000.0, 1234);
		hospital.addFuncionario(gandalf);
		Medico galadriel = new Medico("Galadriel", "F", 232, 13300.0, 4321);
		hospital.addFuncionario(galadriel);
		hospital.mostrarTodosFuncionarios();
	}
}
