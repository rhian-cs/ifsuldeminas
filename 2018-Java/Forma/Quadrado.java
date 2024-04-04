public class Quadrado extends Forma {
	
	// Construtor da classe
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	// Sobrescrevendo o método getArea()
	@Override
	public double getArea() {
		return base*altura;
	}
}
