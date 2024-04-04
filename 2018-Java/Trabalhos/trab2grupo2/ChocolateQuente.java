// Esta classe foi feita por Rhian Luis Garcia Moraes

// Esta classe representa o Alimento Chocolate Quente que possui os tamanhos Pequeno e Médio, apenas
public class ChocolateQuente extends Alimento {
	
	//Construtor da classe
	ChocolateQuente() {
		super("Chocolate Quente", 1, 2, 0); //Definindo o nome e os preços corretos
	}
	
	//Sobreescrevendo os método de pedidos para que funcionem corretamente, pois este produto possui os tamanhos Pequeno e Médio
	@Override
	public double efetuarPedidoPequeno() {
		double preco = this.efetuarPedido(precoPeq);
                return preco;
	}
	
	@Override
	public double efetuarPedidoMedio() {
		double preco = this.efetuarPedido(precoMed);
                return preco;
	}
}