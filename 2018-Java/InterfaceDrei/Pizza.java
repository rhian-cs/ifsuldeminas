public class Pizza {
	// Método main da questão desafio
	public static void main(String[] args) {
		// Array com os sabores disponíveis
		String[] saboresDePizza = {"Bacon", "Brócolis", "Calabresa", "Portuguesa", "Quatro Queijos"};
		
		boolean pedidoConfirmado = false;
		int saborEscolhido = -1;
		
		Interface.mensagem("Boas-vindas à pizzaria!");
		while(!pedidoConfirmado) { // Enquanto o pedido não for confirmado
			// O sabor escolhido recebe um inteiro, a resposta da pergunta
			saborEscolhido = Interface.perguntaComOpcoes("Qual sabor deseja pedir?", saboresDePizza);
			
			// O pedido confirmado recebe a resposta da pergunta
			pedidoConfirmado = Interface.perguntaBooleana("Você tem certeza que deseja uma pizza de " + saboresDePizza[saborEscolhido] + "?");
		} // Se o pedido for confirmado
		Interface.mensagem("Pedido confirmado com sucesso, bom apetite!"); // Mensagem de sucesso!
	}
}
