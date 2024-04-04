public class Animal {
	String tipoMovimento;
	double velocidade;
	
	Animal(String tipoMovimento, double velocidade) {
		this.tipoMovimento = tipoMovimento; //Tipo de movimento
		this.velocidade = velocidade; //Velocidade em m/s
	}
	
	public void mover(double distancia) { //Distância em metros
		double tempo = distancia/velocidade; //Tempo em segundos
		System.out.println(" " + tipoMovimento + " levou " + tempo + " segundos para completar o trajeto de " + distancia + " metros.");
	}
	
	public static void main(String[] args) {
		Cobra snek = new Cobra(5);
		snek.mover(2);
		
		Cachorro scooby = new Cachorro(5);
		scooby.mover(2);
		
		Sapo pepe = new Sapo(2);
		pepe.mover(420);
	}
}
