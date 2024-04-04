
import java.util.HashMap;

// Feito por Rhian Luis Garcia Moraes
// 19/11/2018

public class HashMapExemplo {
	
	// EXEMPLO DA AULA
	public static void main(String[] args) {
		HashMap<Integer, String> jogos = new HashMap<Integer, String>();
		jogos.put(1, "God of War");
		jogos.put(2, "The Last of Us");
		
		for (int i = 1; i <= jogos.size(); i++) {
			System.out.println("Jogo " + i + ": " + jogos.get(i));
		}
	}
}
