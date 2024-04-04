public class Main {
	public static void main(String[] args) {
		String[][] nomesDosBotoes = {
		{"7", "8", "9", "+"},
		{"4", "5", "6", "-"},
		{"1", "2", "3", "/"},
		{"^", "*", ".", "="}
	};
		
		int escalaBotoes = 100;
		int espacamento = 10;
		int botoesX = nomesDosBotoes.length;
		int botoesY = nomesDosBotoes[0].length;
		
		Janela jn = new Janela(
				"Calculadora", 
				(espacamento + escalaBotoes) * botoesX + espacamento * 2, 
				(espacamento + escalaBotoes) * botoesY + espacamento * 4
		);
		
		for (int i = 0; i < nomesDosBotoes.length; i++) {
			for (int j = 0; j < nomesDosBotoes[i].length; j++) {
				String nome = nomesDosBotoes[j][i];
				jn.add(new Botao(
								nome, 
								escalaBotoes*i + (espacamento * (i + 1)), 
								escalaBotoes*j + (espacamento * (j+1)),
								escalaBotoes, escalaBotoes
						)
				);
			}
		}
	}
}
