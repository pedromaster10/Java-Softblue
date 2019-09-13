// Exceção que representa uma quantidade de saldo insuficiente na conta para realizar a transação

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception{
	
	//valor invalido utilizado
	private double saldoDisponivel;
	
	//construtor recebe o valor invalido e a mensagem de erro
	public SaldoInsuficienteException (String mensagem, double saldoDisponivel) {
		super(mensagem);
		
		this.saldoDisponivel = saldoDisponivel;
	}

	//obtem o saldo disponivel
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	
}