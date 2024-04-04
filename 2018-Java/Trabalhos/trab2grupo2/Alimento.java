//Feito por Vanessa Vilela, Matheus, Rhian, Samuel e Lucas
public class Alimento {
	protected String nome; //Nome do alimento
	
	//Os diferentes preços do alimento
	protected double precoPeq;
	protected double precoMed;
	protected double precoGde;
	
	//Construtor da classe
	Alimento(String nome, double precoPeq, double precoMed, double precoGde) {
		this.nome = nome;
		this.precoPeq = precoPeq;
		this.precoMed = precoMed;
		this.precoGde = precoGde;
	}
        
        //Construtor vazio da classe
        Alimento(){
            
        }

	public String getNome() {
		return nome;
	}

	public double getPrecoPeq() {
		return precoPeq;
	}

	public double getPrecoMed() {
		return precoMed;
	}

	public double getPrecoGde() {
		return precoGde;
	}
	
	//Função para efetuar o pedido e falar para o Jorge preparar o alimento
	//Este método é protected pois ele será chamado apenas por outro método nas subclasses
	protected double efetuarPedido(double valorAPagar) {
		return valorAPagar;
	}
	
	//Mostra as informações do alimento
	public void mostrarPrecos() {
		System.out.println(this.nome + ":"); //Exibindo o nome
		
		//Mostrando o tamanho pequeno
		System.out.print("  - Tamanho pequeno: ");
		if(precoPeq > 0) { //Se for um valor válido (positivo)
			System.out.println("R$" + precoPeq); //Mostrar o valor
		}
		else {
			System.out.println("-"); //Caso contrário, exibir um '-'
		}
		
		//Mostrando o tamanho médio
		System.out.print("  - Tamanho médio: ");
		if(precoMed > 0) { //Se for um valor válido (positivo)
			System.out.println("R$" + precoMed); //Mostrar o valor
		}
		else {
			System.out.println("-"); //Caso contrário, exibir um '-'
		}
		
		//Mostrando o tamanho grande
		System.out.print("  - Tamanho grande: ");
		if(precoGde > 0) { //Se for um valor válido (positivo)
			System.out.println("R$" + precoGde); //Mostrar o valor
		}
		else {
			System.out.println("-"); //Caso contrário, exibir um '-'
		}
	}
	
	//Métodos para efetuar o pedido em diferentes tamanhos. Estes métodos, por padrão, exibem mensagens de erro, porém eles são substituídos nas subclasses.
	public double efetuarPedidoPequeno() {
		System.out.println("Erro: O produto não está disponível em um tamanho pequeno.");
                return 0;
	}
	public double efetuarPedidoMedio() {
		System.out.println("Erro: O produto não está disponível em um tamanho médio.");
                return 0;
	}
	public double efetuarPedidoGrande() {
		System.out.println("Erro: O produto não está disponível em um tamanho grande.");
                return 0;
	}
}