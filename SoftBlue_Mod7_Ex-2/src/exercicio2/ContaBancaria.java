package exercicio2;

public abstract class ContaBancaria {
	

	protected double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		
		System.out.println("Realizando deposito de "+valor+" reais");
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		
		if(this.saldo < valor) {
			System.out.println("Vc nao possue saldo suficiente!");
		} else {
		System.out.println("sacando "+ valor +" reais");
		this.saldo -= valor;
		}
	}
	
	public void transferir(double valor, ContaBancaria conta) {
		
		if(this.saldo < valor) {
			System.out.println("Vc nao possue saldo suficiente!");
		} else {
		System.out.println("realizando transferencia de "+valor+" reais");
		conta.saldo += valor;
		this.saldo -= valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public abstract void calcularSaldo();
	
}
