//Classe feita por Matheus dos Santos Inês

//Classe que representa o produto Canjica
public class Canjica extends Alimento{
    
    	//Construtor da classe Canjica.
	Canjica() {
		super("Canjica", 3, 0, 6); //modifica nome (canjica) e preços do produto (pequeno, --, grande.
	}
	
	//Sobreescrevendo o método de pedido, pois esse produto possui  tamanho pequeno e tamanho grande.
	@Override
	public double efetuarPedidoPequeno() {
		double preco = this.efetuarPedido(precoPeq);
                return preco;
	}
        
        @Override
	public double efetuarPedidoGrande() {
		double preco = this.efetuarPedido(precoGde);
                return preco;
	}
}
