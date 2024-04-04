function randomChar()
	{
		rn = Math.floor((Math.random() * 29) + 1);
		var chara = 'f';
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

var tutti = [];
var k = 0;
var gbIdDoElemento;
function sout(index)
{
	document.getElementById(gbIdDoElemento).innerHTML = tutti[index];
}

function hwthis(idDoElemento)
{
	gbIdDoElemento = idDoElemento;
	var arrayCorreto = new Array('H','e','l','l','o',',',' ','w','o','r','l','d','!');
	var arraySaida = new Array();
	var contadorTotal = 0;
	var mostrarContador = true;
	var mostrarTudo = true;

	var doWhile = true;
	var stringTotal = '';
	var stringTotalShow = '';

	for(var i = 0; i < arrayCorreto.length; i++)
	{
		while(doWhile == true)
			{
				if(mostrarContador == true)
				{
					contadorTotal++;
					stringTotal = stringTotal + "G";
					stringTotal = stringTotal + contadorTotal + ": ";
				}
				for(j = 0; j < i; j++)
				{
					var stringTotal = stringTotal + arraySaida[j];
				}
				arraySaida[i] = randomChar();
				stringTotalShow = stringTotal + arraySaida[i];
				if(arraySaida[i] == arrayCorreto[i])
				{
					doWhile = false;
				}
				//tutti.push(stringTotalShow);
				if(mostrarTudo == true)
				{
					document.getElementById(idDoElemento).innerHTML = document.getElementById(idDoElemento).innerHTML + "<br>" + stringTotalShow;
				}
				else
				{
					document.getElementById(idDoElemento).innerHTML = stringTotalShow;
				}
				stringTotal = stringTotalShow = '';
			}
			doWhile = true;
	}
	for(k = 0; k < tutti.length; k++)
	{
		setTimeout(sout(k), 100);
	}
}