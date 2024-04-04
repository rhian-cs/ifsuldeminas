public class Sapo extends Animal {
	
	Sapo(double velocidade) {
		super("quadrúpede saltitante", velocidade);
	}
	
	@Override
	public void mover(double distancia) {
		String tipoAnimal = "sapo";
		System.out.print("Este " + tipoAnimal);
		super.mover(distancia);
	}
}
