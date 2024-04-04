public class Animal {
	public String nome;
	public int idade;
	public double peso;
	
	// Construtor 1 (nome, idade e peso)
	public Animal(String nome, int idade, double peso) {
		this.nome = nome;
		this.setIdade(idade);
		this.setPeso(peso);
	}
	
	// Construtor 2 (nome e idade)
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Construtor 3 (nome e peso)
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public void setIdade(int idade) {
		if (idade > 0) { // Se a idade for válida, possível
			this.idade = idade; // Atribuir o valor
		}
		else { // Caso contrário
			System.out.println("Erro ao definir idade: valor negativo."); // Exibir um erro
		}
	}
	public int getIdade() {
		return idade;
	}

	public void setPeso(double peso) { // Se a idade for válida, possível
		if (peso > 0) { // Atribuir ao objeto
			this.peso = peso; // Atribuir o valor
		}
		else { // Caso contrário
			System.out.println("Erro ao definir idade: valor negativo.");
		}
	}
	public double getPeso() {
		return peso;
	}
	
	public void exibirAnimal() {
		System.out.println("Animal " + this.nome + ":");
		if (this.idade > 0) { //Se a idade for positiva e/ou não nula
			System.out.println("Possui " + this.idade + " anos de idade.");
		}
		if (this.peso > 0) { //Se a idade for positiva e/ou não nula
			System.out.println("Pesa " + this.peso + "kg.");
		}
	}
	
	//Método main para as questões 1 até 7
	public static void main(String[] args) {
		Animal[] felix = new Animal[3];
		
		felix[0] = new Animal("Argyle", 18, 3.4);
		felix[1] = new Animal("Best", 6.9);
		felix[2]  = new Animal("Waifu", 20);
		
		for (int i = 0; i < felix.length; i++) {
			Animal animal = felix[i];
			animal.exibirAnimal();
		}
	}
}