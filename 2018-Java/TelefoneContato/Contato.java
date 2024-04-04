public class Contato 
{
    //Declaração de variáveis
    private String  nome;       //Nome do contato
    private int     telefone;   //Telefone de contato
    
    //Construtor; Parâmetros: Nome e Telefone
    public Contato(String nome, int telefone)
    {
		this.nome       = nome;
		this.telefone   = telefone;
    }
    
    //SETTER e GETTER do NOME
	public void setNome(String novoNome)
	{
	    this.nome = novoNome;
	}
	
	public String getNome()
	{
	    return nome;
	}
	
    //SETTER e GETTER do TELEFONE
	public void setTelefone(int novoTelefone)
	{
	    this.telefone = novoTelefone;
	}
	
	public int getTelefone()
	{
	    return telefone;
	}

    public void mostrarContato()
    {
		System.out.printf("O telefone do contato %s é %d.%n",getNome(),getTelefone());
    }

}
