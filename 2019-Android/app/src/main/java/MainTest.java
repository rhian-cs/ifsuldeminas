import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainTest {
	
	public static void main(String[] args) {
		ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
		exercicios.add(new Exercicio("Remada Supinada"));
		exercicios.add(new Exercicio("Pullover Halteres"));
		exercicios.add(new Exercicio("Supino Reto"));
		exercicios.add(new Exercicio("Rosca Martelo"));
		exercicios.add(new Exercicio("Rosca Scott"));
		exercicios.add(new Exercicio("Pulldown"));
		exercicios.add(new Exercicio("Leg Press 45°"));
		
		FichaDeTreino ficha = new FichaDeTreino("Despacito", Calendar.getInstance(Locale.getDefault()), 3, 10, exercicios);
		System.out.println(ficha.getInfo());
	}
}
