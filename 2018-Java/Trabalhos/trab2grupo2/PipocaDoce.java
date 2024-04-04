//Feito por Vanessa Vilela Tavares

//Subclasse da classe Alimento para representar a Pipoca Doce
public class PipocaDoce extends Alimento{
    
    //Construtor da classe
    public PipocaDoce() {
        //Aqui foi especificado o nome do produto e os preços do produtos pequeno, médio e grande, respectivamente
        super("Pipoca Doce", 1.30, 2.70, 4.00);
    }
    
    //A Pipoca Doce possui todos os tamanhos, logo todos os métodos para efetuar pedido foram sobreescritos
    //Método que efetua o pedido pequeno
    @Override
    public double efetuarPedidoPequeno() {
	double preco = this.efetuarPedido(precoPeq);
        return preco;
    }
    
    //Método que efetua o pedido médio
    @Override
    public double efetuarPedidoMedio() {
	double preco = this.efetuarPedido(precoMed);
        return preco;
    }
    
    //Método que efetua o pedido grande
    @Override
    public double efetuarPedidoGrande() {
	double preco = this.efetuarPedido(precoGde);
        return preco;
    }
    
}
