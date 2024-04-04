//Classe que representa o produto Pamonha, desenvolvida por Lucas Zenun.
public class Pamonha extends Alimento {
	
	//Construtor da classe
	Pamonha() {
		super("Pamonha", 0, 3.40, 0); //Definindo o nome e o preço correto
	}
	
	//Sobreescrevendo o método de pedido para que funcione corretamente, pois esse produto possui apenas tamanho médio
	@Override
	public double efetuarPedidoMedio() {
		double preco = this.efetuarPedido(precoMed);
                return preco;
	}
}
