public class Carta {
	//Representa o número da carta de 1 a 13
	private int numero;
	//Representa o naipe de uma carta. Pode ser paus, ouro, copas ou espadas
	private int naipe;
	private boolean erro;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNaipe() {
		return naipe;
	}

	public void setNaipe(int naipe) {
		this.naipe = naipe;
	}

	public boolean erro() {
		return erro;
	}
	
	
	private int checarNum(char letra)
	{
		int numero = 0;
		switch(Character.toUpperCase(letra)) {
			case 'A':
				numero = 1;
				break;
			case 'J':
				numero = 11;
				break;
			case 'Q':
				numero = 12;
				break;
			case 'K':
				numero = 13;
				break;
			default:
				System.out.println("Erro ao criar objeto. O número da carta é inválido.");
				this.erro = true;
				break;
		}
		return numero;
	}
	
	private int checarNaipe(String naipeString) {
		int naipeInt = 0;
		switch(naipeString) {
			case "Paus":
				naipeInt = 1;
				break;
			case "Ouros":
				naipeInt = 2;
				break;
			case "Copas":
				naipeInt = 3;
				break;
			case "Espadas":
				naipeInt = 4;
				break;
			default:
				System.out.println("Erro ao criar objeto. O naipe da carta é inválido.");
				this.erro = true;
				break;
		}
		return naipeInt;
	}
	
	public Carta(int numero, String naipeString) {
		this.erro = false;
		this.numero = numero;
		this.naipe = checarNaipe(naipeString);
	}
	public Carta(int numero, int naipeNum) {
		this.erro = false;
		this.numero = numero;
		this.naipe = naipeNum;
	}
	public Carta(char letra, String naipeString) {
		this.erro = false;
		this.numero = checarNum(letra);
		this.naipe = checarNaipe(naipeString);
	}
	public Carta(char letra, int naipeNum) {
		this.erro = false;
		this.numero = checarNum(letra);
		this.naipe = naipeNum;
	}
	
	// Mostra as informações da carta
	public void mostrarCarta() {
		if(this.numero > 1 && this.numero < 11) {
			System.out.println(this.numero);
		}
		else {
			switch(this.numero) {
				case 1:
					System.out.print("A");
					break;
				case 11:
					System.out.print("J");
					break;
				case 12:
					System.out.print("Q");
					break;
				case 13:
					System.out.print("K");
					break;
			}
		}
		System.out.print(" de ");
		switch(this.naipe) {
			case 1:
				System.out.println("Paus");
				break;
			case 2:
				System.out.println("Ouros");
				break;
			case 3:
				System.out.println("Copas");
				break;
			case 4:
				System.out.println("Espadas");
				break;
		}
	}
}