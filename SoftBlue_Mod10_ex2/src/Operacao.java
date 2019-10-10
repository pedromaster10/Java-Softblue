
public enum Operacao {
	// Declara os elementos do enum. No construtor, � fornecido um char que representa o s�mbolo da opera��o
	SOMA('+'),
	SUBTRACAO('-'),
	DIVISAO('/'),
	MULTIPLICACAO('*');
	
	//simbolo da operacao
	private char valor;
	
	//contrutor
	Operacao (char valor) {
		this.valor = valor;
	}
	
	public char getValor() {
		return valor;
	}
	// Efetua o c�lculo com base na opera��o. Checa em qual elemento do enum o m�todo est� sendo chamado 
	// e realiza a opera��o adequadamente.
	public Double calcular (Double n1, Double n2) {
		if (this == SOMA) {
			Double resultado = n1 + n2;
			return resultado;
		} else if (this == SUBTRACAO) {
			Double resultado = n1 - n2;
			return resultado;	
			} else if (this == DIVISAO) {
				Double resultado = n1 / n2;
				return resultado;
			} else if (this == MULTIPLICACAO) {
				Double resultado = n1 * n2;
				return resultado;
			} else // Foi utilizado um elemento do enum desconhecido (o c�digo n�o sabe como calcular)
				throw new UnsupportedOperationException("O c�lculo n�o pode ser realizado");			
	}
	
	// Representa��o de string do enum. Retorna o s�mbolo do enum em forma de string
		public String toString() {
			return String.valueOf(valor);
		}
	
}
