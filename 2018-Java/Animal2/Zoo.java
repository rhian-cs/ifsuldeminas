
import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animais; //ArrayList onde ficam todos os animais
	
	public Zoo() { // Construtor vazio
		animais = new ArrayList(); // Inicializa o ArrayList
	}
	
	public void addAnimal(Animal animal) {
		this.animais.add(animal); // Adiciona um animal no ArrayList de animais
	}
	
	public void exibirAnimais() {
		for (int i = 0; i < getQuantidadeDeAnimais(); i++) { // Para cada animal do zoológico
			Animal animal = this.animais.get(i); // Uso do Polimorfismo
			animal.exibirAnimal(); // Mostrar as informações do animal
		}
	}
	
	public int getQuantidadeDeAnimais() {
		return this.animais.size(); // Retorna o tamanho do ArrayList de animais
	}
	
	// Método main para a questão Desafio
	public static void main(String[] args) {
		Zoo zoo = new Zoo(); // Criando um zoológico
		
		// Adicionando 3 animais ao zoológico
		zoo.addAnimal(new Animal("Hue", 10, 20.5));
		zoo.addAnimal(new Animal("Hus", 5));
		zoo.addAnimal(new Animal("BR'hus", 2.5));
		
		// Mostrando a quantidade de animais
		System.out.println("Este zoológico possui " + zoo.getQuantidadeDeAnimais() + " animais.");
		
		// Mostrando cada animal e suas propriedades
		zoo.exibirAnimais();
	}
}
