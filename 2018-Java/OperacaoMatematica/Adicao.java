public class Adicao extends OperacaoMatematica{
	public Adicao (double op1, double op2) {
		super(op1, op2);
	}

        @Override
	public void calcular() {
		super.calcular();
		System.out.println(this.op1 + this.op2);
	}
}
