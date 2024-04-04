public class Cachorro extends Animal {
	
	Cachorro(double velocidade) {
		super("quadrúpede caminhante", velocidade);
	}
	
	@Override
	public void mover(double distancia) {
		String tipoAnimal = "cachorro";
		System.out.print("Este " + tipoAnimal);
		super.mover(distancia);
	}
}
