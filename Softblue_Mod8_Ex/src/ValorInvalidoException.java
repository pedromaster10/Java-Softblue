// Exceção que representa uma quantidade de saldo insuficiente na conta para realizar a transação

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception{
	
	//valor invalido utilizado
	private double valorInvalido;
	
	//construtor recebe o valor invalido e a mensagem de erro
	public ValorInvalidoException (String mensagem, double valorInvalido) {
		super(mensagem);
		
		this.valorInvalido = valorInvalido;
	}

	//obtem o valor invalido
	public double getValorInvalido() {
		return valorInvalido;
	}
	
	
}