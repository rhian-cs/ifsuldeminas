import java.util.Random;

public class Main
{
	char randomChar()
	{
		Random r = new Random();
		int rn = r.nextInt(30);
		char chara = 'f';
		switch(rn)
		{
			case 1:
				chara = 'a';
				break;
			case 2:
				chara = 'b';
				break;
			case 3:
				chara = 'c';
				break;
			case 4:
				chara = 'd';
				break;
			case 5:
				chara = 'e';
				break;
			case 6:
				chara = 'f';
				break;
			case 7:
				chara = 'g';
				break;
			case 8:
				chara = 'H';
				break;
			case 9:
				chara = 'i';
				break;
			case 10:
				chara = 'j';
				break;
			case 11:
				chara = 'k';
				break;
			case 12:
				chara = 'l';
				break;
			case 13:
				chara = 'm';
				break;
			case 14:
				chara = 'n';
				break;
			case 15:
				chara = 'o';
				break;
			case 16:
				chara = 'p';
				break;
			case 17:
				chara = 'q';
				break;
			case 18:
				chara = 'r';
				break;
			case 19:
				chara = 's';
				break;
			case 20:
				chara = 't';
				break;
			case 21:
				chara = 'u';
				break;
			case 22:
				chara = 'v';
				break;
			case 23:
				chara = 'w';
				break;
			case 24:
				chara = 'x';
				break;
			case 25:
				chara = 'y';
				break;
			case 26:
				chara = 'z';
				break;
			case 27:
				chara = ',';
				break;
			case 28:
				chara = ' ';
				break;
			case 29:
				chara = '!';
				break;
		}
		return chara;
	}
	
	public static void main(String[] args)
	{
		boolean limparTela = true;
		
		Main m = new Main();
		char[] correto = new char [13];
		char[] saida = new char [13];
		correto[0] = 'H';
		correto[1] = 'e';
		correto[2] = 'l';
        correto[3] = 'l';
        correto[4] = 'o';
		correto[5] = ',';
		correto[6] = ' ';
		correto[7] = 'w';
		correto[8] = 'o';
		correto[9] = 'r';
		correto[10] = 'l';
		correto[11] = 'd';
		correto[12] = '!';
		
		int contagem = 0;
		int checkCorreto = 0;
		boolean doWhile = true;
		
		//Testar cada caractere
		for(int i = 0; i < 13; i++)
		{
			while(doWhile == true)
			{
				contagem++;
				//Exibir na tela
				System.out.print("G");
				if(contagem < 100)
				{
					System.out.print("0");
					if(contagem < 10)
					{
						System.out.print("0");
					}
				}
				System.out.print(contagem + ": ");
				for(int j = 0; j < i; j++)
				{
					System.out.print(saida[j]);
				}
				saida[i] = m.randomChar();
				System.out.print(saida[i]);
				for(int k = i; k < 13; k++)
				{
					System.out.print(m.randomChar());
				}
				if((char) saida[i] == (char) correto[i])
				{
					doWhile = false;
				}
				System.out.println("");
			}
			doWhile = true;
		}
	}
}