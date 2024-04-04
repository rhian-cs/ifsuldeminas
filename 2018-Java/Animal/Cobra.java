public class Cobra extends Animal {
	
	Cobra(double velocidade) {
		super("rastejante", velocidade);
	}
	
	@Override
	public void mover(double distancia) {
		String tipoAnimal = "cobra";
		System.out.print("Esta " + tipoAnimal);
		super.mover(distancia);
	}
}
