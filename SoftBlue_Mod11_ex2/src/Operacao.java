
public enum Operacao {
	// Declara os elementos do enum. No construtor, é fornecido um char que representa o símbolo da operação
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
	// Efetua o cálculo com base na operação. Checa em qual elemento do enum o método está sendo chamado 
	// e realiza a operação adequadamente.
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
			} else // Foi utilizado um elemento do enum desconhecido (o código não sabe como calcular)
				throw new UnsupportedOperationException("O cálculo não pode ser realizado");			
	}
	
	// Representação de string do enum. Retorna o símbolo do enum em forma de string
		public String toString() {
			return String.valueOf(valor);
		}
	
}
