import java.util.ArrayList;
import java.util.Scanner;

public class Barraquinha {
	private ArrayList <Alimento> cardapio; //ArrayList que contém os itens disponíveis no cardáio
        private ArrayList <String> produtos;
	
	public Barraquinha() {
		this.cardapio = new ArrayList(); //Inicializando o ArrayList do cardápio
		
		//Adicionando os itens disponíveis no cardáio
		this.cardapio.add(new ChocolateQuente());
                this.cardapio.add(new Pamonha());
                this.cardapio.add(new PipocaDoce());
                this.cardapio.add(new MilhoCozido());
                this.cardapio.add(new Canjica());
		
                this.produtos = new ArrayList();
	}
	
	public void mostrarCardapio() {
		System.out.println("Alimentos disponíveis:"); //Mostrando todos os alimentos disponíveis
		for (int i = 0; i < cardapio.size(); i++) { //Percorrendo o ArrayList do cardápio
			cardapio.get(i).mostrarPrecos(); //Mostrando os tamanhos e o preço de cada um
		}
	}
	
	public void mostrarPedidos() {
		//Mostrando todos os alimentos que Jorge deverá preparar
		System.out.println("Pedidos a serem realizados: ");
		for (int i = 0; i < produtos.size(); i++) { 
			System.out.println(" - " + produtos.get(i)); 
		}
	}
	
        //Adiciona um produto pedido aos pedidos
	public void adicionarProduto(String nome, String nomeDoAlimento, String tamanhoDoAlimento, double precoDoAlimento) {
		this.produtos.add(nome + ": " + nomeDoAlimento + " " + tamanhoDoAlimento + " (R$" + precoDoAlimento + ")");
                
	}
        
        //Mostra as opções do cardápio sem o preço
        public void mostrarOpcoes(){
            for(int i = 0; i < cardapio.size(); i++){
                System.out.printf("%d - ", i);
                System.out.println(cardapio.get(i).getNome());
            }
        }
        
        //Mostra os tamanhos dos produtos
        public void mostrarTamanhos(int produto){
            System.out.print("Tamanhos disponíveis para ");
            cardapio.get(produto).mostrarPrecos();
        }
        
        //Coleta as informações das pessoas e acrescenta os produtos que ela pediu aos pedidos
        public void efetuarPedido(int numeroProdutos){
            Scanner in = new Scanner(System.in);
            double precoDoPedido = 0;
            double total = 0;
            
            //Coleta o nome da pessoa com o começo de seu cpf para saber para quem é o pedido
            System.out.println("Digite seu nome seguido dos 3 primeiros números do seu cpf (exemplo: Fulano123):");
            String nome = in.next();
            
            //O for executa de acordo com o número de produtos que a pessoa pediu, pois a cada execução é adicionado um produto aos pedidos
            for (int i=1; i<=numeroProdutos; i++){
                this.mostrarOpcoes(); //Mostra as opções do cardápio para a pessoa poder escolher
                System.out.println("Digite o número do produto que você quer comprar:");
                int produto = in.nextInt();
                System.out.println("1 - Tamanho pequeno");
                System.out.println("2 - Tamanho médio");
                System.out.println("3 - Tamanho grande");
                this.mostrarTamanhos(produto); //Mostra os tamanhos existentes do produto que a pessoa pediu
                System.out.println("Digite o número do tamanho:");
                int tamanho = in.nextInt();
                //De acordo com o tamanho escolhido, o switch entra no case referente
                switch(tamanho) {
                        //Para o tamanho pequeno
			case 1:
                            precoDoPedido = this.cardapio.get(produto).efetuarPedidoPequeno();
                            //Caso o tamanho exista, o produto é adcionado para ser preparado
                            if (precoDoPedido>0){
                                this.adicionarProduto(nome, cardapio.get(produto).getNome(), "Pequeno", precoDoPedido);
                            }
                            break;
                        //Para o tamanho médio
			case 2:
                            precoDoPedido = this.cardapio.get(produto).efetuarPedidoMedio();
                            //Caso o tamanho exista, o produto é adcionado para ser preparado
                            if (precoDoPedido>0){
                                this.adicionarProduto(nome, cardapio.get(produto).getNome(), "Médio", precoDoPedido);
                            }
                            break;
                        //Para o tamanho grande
			case 3: 
                            precoDoPedido = this.cardapio.get(produto).efetuarPedidoGrande();
                            //Caso o tamanho exista, o produto é adcionado para ser preparado
                            if (precoDoPedido>0){
                                this.adicionarProduto(nome, cardapio.get(produto).getNome(), "Grande", precoDoPedido);
                            }
                            break;
		}
                //É calculado o valor total de acordo com o preço de cada produto escolhido
                total += precoDoPedido;
            }
            //É exibido uma confirmação de que o pedido foi realizado, seguido do valor total do pedido
            System.out.println("Pedido realizado!");
            System.out.println("Total a pagar: R$"+total);
        }
        
        //A pessoa paga o pedido por produto
        public void pagarProduto(){
            //Aqui é exibido os produtos que estão nos pedidos
            for (int i = 0; i < produtos.size(); i++) { 
                System.out.printf("%d - ", i);
		System.out.println(produtos.get(i));
            }
            //A pessoa escolhe qual produto ela quer pagar
            System.out.println("Qual produto deseja pagar?");
            Scanner in = new Scanner(System.in);
            int numeroPedido = in.nextInt();
            //O produto é removido dos pedidos (porque tecnicamente já foi feito se foi pago)
            produtos.remove(numeroPedido);
        }
        
        public static void main(String[] args) {
            //Objeto da classe Barraquinha para chamar os métodos
            Barraquinha barraquinha = new Barraquinha();
            Scanner in = new Scanner(System.in);
            int resposta = 1;
            while (resposta == 1){
                //Menu para a pessoa escolher o que ela quer fazer
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Fazer pedido");
                System.out.println("2 - Pagar produto");
                System.out.println("3 - Ver cardápio");
                System.out.println("4 - Mostrar pedidos");
                //Lendo a escolha 
                int escolha = in.nextInt();
                //De acordo com a escolha, o switch entra no case referente
                switch(escolha) {
                    //Permite a pessoa fazer um pedido
                    case 1:
                            System.out.println("Quantos produtos deseja pedir?");
                            int numeroProdutos = in.nextInt();
                            barraquinha.efetuarPedido(numeroProdutos);
                        break;
                    //Permite a pessoa pagar o produto
                    case 2:
                        barraquinha.pagarProduto();
                        break;
                    //Permite a pessoa ver o cardápio
                    case 3:
                        barraquinha.mostrarCardapio();
                        break;
                    //Perite a pessoa ver os pedidos que estão para fazer
                    case 4:
                        barraquinha.mostrarPedidos();
                        break;
                }
                
                //Verifica se a pessoa quer fazer mais alguma coisa
                System.out.println("Deseja fazer outra operação?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                resposta = in.nextInt();
            }
            
        }
        
}