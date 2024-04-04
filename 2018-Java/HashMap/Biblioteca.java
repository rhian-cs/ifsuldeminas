
import java.util.HashMap;

// Feito por Rhian Luis Garcia Moraes
// 19/11/2018

// 1) Faça uma classe denominada Biblioteca e defina um atributo livros:HashMap<Integer, String>
public class Biblioteca {
	// ATIVIDADE
	
	private HashMap<Integer, String> livros;
	
	// 2) Faça um construtor padrão, isto é, que não recebe parâmetros, para a classe Biblioteca inicializando o atributo livros.
	public Biblioteca() {
		livros = new HashMap<Integer, String>();
	}
	
	// Faça um método addLivro(int id, String nome) que permite adicionar um livro ao atributo livros.
	public void addLivro(Integer id, String nome) {
		livros.put(id, nome);
	}
	
	// 4) Faça um método consultarLivro(int id) que permite exibir um livro cujo identificador é id
	public void consultarLivro(Integer id) {
		System.out.println("Livro " + id + ": " + livros.get(id));
	}
	
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		
		// 5) O que acontece se dois livros com o mesmo id forem adicionados?
		// Consulte a documentação da classe HashMap e responda:
		// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
		// RESPOSTA 5): O Java registrará a entrada mais recente ao mesmo Id, e não retornará nenhum erro,
		// como demonstrado no exemplo abaixo, o livro de id 1 será o livro BR'hus.
		b.addLivro(1, "Huehus");
		b.addLivro(1, "BR'hus");
		b.consultarLivro(1);
		
		// 6) Qual o método permite remover todos os pares <chave,valor> armazenados em um objeto
		// HashMap?
		// RESPOSTA 6): O método clear() limpa todos os pares do HashMap.
		
		// 7) Qual o retorno do método containsKey(Object key) e o que pode ser feito com
		// este método?
		// RESPOSTA 7): Retorna true se uma chave no HashMap existe, e false caso contrário.
		
		// 8) Cite dois métodos da classe que poderiam ser usados para verificar se um objeto HashMap
		// não está vazio, isto é, possui pelo menos um par <chave,valor>.
		// RESPOSTA 8): É possível ao utilizar o método verificar se o HashMap está vazio com isEmpty(),
		// e se não está vazio com !isEmpty().
		// Outro método utilizável é o size(), que retorna quantos elementos existem no HashMap: 
		// Se for zero, então o HashMap está vazio.
	}
}
