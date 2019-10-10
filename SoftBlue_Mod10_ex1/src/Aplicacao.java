
public class Aplicacao {
	
	public static void main (String[] args) {
		Double graus = 26.0;
		
		double resposta = Matematica.converterAngulo(graus, Matematica.TipoAngulo.GRAUS);
		System.out.println(String.format("A conversao dos %.2f graus para radianos eh igual a %.2f", graus, resposta));
		
		double resposta2 = Matematica.converterAngulo(graus, Matematica.TipoAngulo.RADIANOS);
		System.out.println(String.format("A conversao dos %.2f radianos para graus eh igual a %.2f", graus, resposta2));
		
		int binarioConvertido = Matematica.converterBinarioParaDecimal("1110");
		System.out.println(String.format("O numero inteiro resultante do binario eh %d", binarioConvertido));
	}
}
