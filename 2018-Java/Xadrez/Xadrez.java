public class Xadrez {
	private Painel[][] posicoes;
	private Janela janela;
	private int escala;
	
	public Xadrez() {
		this.posicoes = new Painel [8][8];
		escala = 50;
		janela = new Janela(escala*10, escala*10);
	}
	
	public void addTabuleiro() {
		int x = 0;
		int y = 0;
		for(Painel[] posX : this.posicoes) {
			for(Painel posY : posX) {
				System.out.printf("X = %d e Y = %d\n", x+1, y+1);
				int soma = x + y;
				String cor = "";
				switch(soma % 2) {
					case 0:
						cor = "preto";
						break;
					default:
						cor = "branco";
						break;
				}
				posY = new Painel(cor);
				posY.setBounds((x+2) * escala, y * escala, escala, escala);
				janela.add(posY);
				y++;
			}
			y = 0;
			x++;
		}
	}
	
	public static void main(String[] args) {
		Xadrez x = new Xadrez();
		x.addTabuleiro();
	}
}
