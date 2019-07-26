package exercicio2;

public class ContaInvestimento extends ContaBancaria {

	public ContaInvestimento(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSaldo() {

		this.saldo += 0.05;
	}

}
