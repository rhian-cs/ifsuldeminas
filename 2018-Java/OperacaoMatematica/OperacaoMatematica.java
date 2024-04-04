import java.util.ArrayList;

public class OperacaoMatematica {
	protected double op1;
	protected double op2;
	
	public OperacaoMatematica(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public void calcular() {
		System.out.print("Resultado = ");
	}

	public static void main(String args[]) {
		ArrayList <OperacaoMatematica> operacoes = new ArrayList();
		operacoes.add(new Adicao(3,8));
		operacoes.add(new Subtracao(3,8));
		operacoes.add(new Subtracao(5,5));
		
		OperacaoMatematica opAtual = null;
		for(int i = 0; i < operacoes.size(); i++) {
                        opAtual = operacoes.get(i);
			opAtual.calcular();
		}
	}
}

