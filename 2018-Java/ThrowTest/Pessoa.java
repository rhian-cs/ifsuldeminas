/*public class Pessoa {

	private int idade;

	public void setIdade ( int idade ) throws Exception {
		if ( idade <= 0 ) {
			throw new Exception ("Idade deve possuir valor maior que zero\n" ) ;
		} else {
			this.idade = idade ;
		}
	}

	public static void main(String[] args) {
		Pessoa antonio = new Pessoa () ;
		try {
			antonio.setIdade (0) ;
		} catch ( Exception e ) {
			System.out.println(( e . getMessage ( ) ) );
		}
	}
}*/

public	  	 class 
Pessoa		{private 
int idade	; public 
void		setIdade 
(int		idade ) 
throws		Exception 
{if (		idade <= 0
){throw		new Exception 
("Idade "
		+ "deve possuir valor maior que zero\n" ) ;
		} else {
			this.idade = idade ;
		}
	}

	public static void main(String[] args) {
		Pessoa antonio = new Pessoa () ;
		try {
			antonio.setIdade (0) ;
		} catch ( Exception e ) {
			System.out.println(( e . getMessage ( ) ) );
		}
	}
}