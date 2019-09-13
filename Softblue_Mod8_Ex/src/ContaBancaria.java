public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		//se o valor for negativo, lan�a uma exe��o
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor digitado para saque eh invalido: ", valor);
		}
		//se n�o houver saldo, lan�a uma exce��o
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo da conta insuficiente: ", saldo);
		}
		//se estiver tudo certo, realiza o saque
		saldo -= valor;		
	}
	
	public void depositar (double valor) throws ValorInvalidoException {
		//se o valor for negativo, lan�a uma exe��o
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor digitado para saque eh invalido: ", valor);
		}
		saldo += valor;
	}
	
	public void transferir (double valor, ContaBancaria conta) throws SaldoInsuficienteException, ValorInvalidoException{
		sacar(valor);
		conta.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}
	
}