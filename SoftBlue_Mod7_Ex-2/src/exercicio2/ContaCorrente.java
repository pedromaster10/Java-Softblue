package exercicio2;

public class ContaCorrente extends ContaBancaria {
	
	
	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSaldo() {
		
		this.saldo -= 0.1;
	}
	

}
