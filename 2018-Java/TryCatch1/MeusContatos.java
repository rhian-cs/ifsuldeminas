// Classe de MeusContatos
public class MeusContatos {
	// Array de pessoas
	private Pessoa pessoas[];
	
	// Getter do array de pessoas
	public Pessoa[] getPessoas() {
		return pessoas;
	}

	// Construtor
	public MeusContatos() {
		pessoas = new Pessoa[2]; // Inicializa o vetor com 2 posições
	}
	
	// Método para adicionar uma pessoa ao vetor
	public void addPessoa(Pessoa novaPessoa, int posicao) {
		try { // Tentar adicioná-la e mostrar uma mensagem de sucesso
			pessoas[posicao] = novaPessoa;
			System.out.println("Sucesso ao adicionar " + novaPessoa.getNome() + " na posição " + posicao + " do vetor.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // Ao falhar por conta desta exceção, mostrar uma mensagem de erro
			System.out.println("Erro ao adicionar " + novaPessoa.getNome() + " ao vetor, pois a posição " + posicao + " não existe no vetor. (O vetor só possui posições de 0 a " + (pessoas.length - 1) + ").");
		}
	}
	
	// Método Main
	public static void main(String[] args) {
		// Criando 3 pessoas
		Pessoa fernando = new Pessoa("Fernando", 13);
		Pessoa jair = new Pessoa("Jair", 17);
		Pessoa marina = new Pessoa("Marina", 18);
		
		// Criando um objeto MeusContatos
		MeusContatos tretas = new MeusContatos();
		
		// Adicionando as pessoas e testando as exceções
		tretas.addPessoa(fernando, 0);
		tretas.addPessoa(jair, 1);
		tretas.addPessoa(marina, 2);
		
	}
}