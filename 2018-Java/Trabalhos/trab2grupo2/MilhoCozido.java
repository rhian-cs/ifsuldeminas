//Classe feita por Samuel Wesley BArbosa Bueno

//Classe para representar o produto Milho cozido
public class MilhoCozido extends Alimento{
    
    	//Construtor da classe MilhoCozido.
	MilhoCozido() {
		super("Milho Cozido (copo)", 0, 4.00, 5.00); //alterando nome e preço do produto.
	}
	
	//Sobreescrevendo o método de pedido, pois esse produto possui  tamanho médio e tamanho grande.
	@Override
	public double efetuarPedidoMedio() {
		double preco = this.efetuarPedido(precoMed);
                return preco;
	}
        
        @Override
	public double efetuarPedidoGrande() {
		double preco = this.efetuarPedido(precoGde);
                return preco;
	}
}
