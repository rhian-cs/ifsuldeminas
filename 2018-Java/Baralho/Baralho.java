
import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
	//Representa quais são as cartas do baralho
	private ArrayList <Carta> cartas;
	
	//Construtor vazio do baralho
	public Baralho() {
		this.cartas = new ArrayList();
	}
	
	public void add1(Carta novaCarta) {
		if(novaCarta.erro() == false) {
			this.cartas.add(novaCarta);
		}
	}
	public void add1(int numero, int naipeNum) {
		if(criarNovaCarta(numero, naipeNum).erro() == false) {
			this.cartas.add(novaCarta);
		}
	}
	public void add1(Carta novaCarta) {
		if(novaCarta.erro() == false) {
			this.cartas.add(novaCarta);
		}
	}
	public void add1(Carta novaCarta) {
		if(novaCarta.erro() == false) {
			this.cartas.add(novaCarta);
		}
	}
	public void add1(Carta novaCarta) {
		if(novaCarta.erro() == false) {
			this.cartas.add(novaCarta);
		}
	}
	
	public void embaralhar() {
		Collections.shuffle(cartas);
	}
	
	public void mostrarCartas() {
		for(int i = 0; i < this.cartas.size(); i++) {
			this.cartas.get(i).mostrarCarta();
		}
	}
	
	public Carta criarNovaCarta(int numero, int naipeNum) {
		return new Carta(numero, naipeNum);
	}
	public Carta criarNovaCarta(int numero, String naipeString) {
		return new Carta(numero, naipeString);
	}
	public Carta criarNovaCarta(char letra, int naipeNum) {
		return new Carta(letra, naipeNum);
	}
	public Carta criarNovaCarta(char letra, String naipeString) {
		return new Carta(letra, naipeString);
	}
	
	public void addN(Carta novaCarta, int nCartas)
	{
		for(int i = 0; i < nCartas; i++) {
			this.add1(novaCarta);
		}
	}
	public void addN(int num, String naipeString, int nCartas)
	{
		for(int i = 0; i < nCartas; i++) {
			this.add1(criarNovaCarta(num, naipeString));
		}
	}
	public void addN(int num, int naipeNum, int nCartas)
	{
		for(int i = 0; i < nCartas; i++) {
			this.add1(criarNovaCarta(num, naipeNum));
		}
	}
	public void addN(char letra, String naipeString, int nCartas)
	{
		for(int i = 0; i < nCartas; i++) {
			this.add1(criarNovaCarta(letra, naipeString));
		}
	}
	public void addN(char letra, int naipeNum, int nCartas)
	{
		for(int i = 0; i < nCartas; i++) {
			this.add1(criarNovaCarta(letra, naipeNum));
		}
	}
	
	//Método principal
	public static void main(String[] args) {
		Baralho copag = new Baralho();
		copag.addN(1,4,2);
		copag.add1(1,55,3);
		copag.mostrarBaralho();
	}
}
