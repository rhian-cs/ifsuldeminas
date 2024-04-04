public class Triangulo extends Forma {
	
	// Construtor da classe
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	// Sobrescrevendo o método getArea()
	@Override
	public double getArea() {
		return (base*altura)/2;
	}
}
