package Calculos;


import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adm
 */
public class Formato {
	public static String dinheiro(Object dinheiro) {
		return Formato.dinheiro(dinheiro, false);
	}
	
	public static String dinheiro(Object dinheiro, boolean mostrarCifrao) {
		String dinheiroEmString = dinheiro + "";
		
		/*int tamTotal = dinheiroEmString.length(); // Tamanho 
		while (tamTotal < 3) { // Ajustando para valores pequenos como 2, que irá virar 0,02 na formatação.
			dinheiroEmString = "0" + dinheiroEmString;
			tamTotal = dinheiroEmString.length();
		}
		
		// Formatando as casas antes da vírgula
		
		String casasInteiras = dinheiroEmString.substring(0, tamTotal - 2); // Valor antes da vírgula
		
		// Formatando as casas depois da vírgula
		String casasDecimais = dinheiroEmString.substring(tamTotal - 2);
		
		// Juntando todas elas e separando pela vírgula
		String dinheiroFormatado = casasInteiras + "," + casasDecimais;*/
		
		double dinheiroDouble = new Double(dinheiroEmString) / 100;
		
		Locale locale = new Locale("pt", "BR");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String dinheiroFormatado = currencyFormatter.format(dinheiroDouble);
		
		if (!mostrarCifrao) {
			dinheiroFormatado = dinheiroFormatado.replace("R$ ", "");
		}
		
		return dinheiroFormatado;
	}
	
	public static String primeiraLetraMaiuscula(String valor) {
		if (valor.length() <= 1) {
			return valor.toUpperCase();
		}
		return valor.substring(0, 1).toUpperCase() + valor.substring(1);
	}
	
	public static HashMap setPeriodos(String tipoPeriodoUsuario) {
		HashMap<String, String> tipoPeriodo = new HashMap();
		
		switch(tipoPeriodoUsuario.toLowerCase()) {
			case "diário": // Com acento
			case "diario": // Sem acento
				tipoPeriodo.put("adjetivo", "diário");
				tipoPeriodo.put("singular", "dia");
				tipoPeriodo.put("plural", "dias");
				break;
			case "mensal":
				tipoPeriodo.put("adjetivo", "mensal");
				tipoPeriodo.put("singular", "mês");
				tipoPeriodo.put("plural", "meses");
				break;
			case "semestral":
				tipoPeriodo.put("adjetivo", "semestral");
				tipoPeriodo.put("singular", "semestre");
				tipoPeriodo.put("plural", "semestres");
				break;
			case "anual":
				tipoPeriodo.put("adjetivo", "anual");
				tipoPeriodo.put("singular", "ano");
				tipoPeriodo.put("plural", "anos");
				break;
			default: // Quando o tipo de período é inválido
				System.out.println("Atenção: Tipo de período '" + tipoPeriodoUsuario + "' não reconhecido.");
				tipoPeriodo.put("adjetivo", "por período");
				tipoPeriodo.put("singular", "período");
				tipoPeriodo.put("plural", "períodos");
		}
		return tipoPeriodo;
	}
	
	public static int arredondarDouble(double x) {
		return arredondarDouble(x, true);
	}
	
	public static int arredondarDouble(double x, boolean multiplicarPorCem) {
		double y;
		if (multiplicarPorCem) {
			y = x * 100;
		} else {
			y = x;
		}
		return new Double(Math.floor(y)).intValue();
	}
	
	public static int indexOfArray(Object[] array, Object value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean verificarNumeroValido(String num) {
		double x;
		try	{
			x = Double.parseDouble(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean verificarInteiroValido(String num) {
		int x;
		try	{
			x = Integer.parseInt(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
