public abstract class Forma {
	// Atributos da classe
	public double base;
	public double altura;
	
	// Construtor para a Forma
	public Forma(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Método abstrato que será sobrescrito
	public abstract double getArea();
	
	// Método main para teste
	public static void main(String[] args) {
		Triangulo tri = new Triangulo(2, 4); // Criando um triângulo com base 2 e altura 4
		Quadrado quad = new Quadrado(2, 4); // Criando um quadrado com base 2 e altura 4
		
		// Exibindo as áreas dos objetos
		System.out.println("A área do triângulo é de " + tri.getArea());
		System.out.println("A área do quadrado é de " + quad.getArea());
	}
}
