
public class Aplicacao {

	public static void main(String[] args) {
		
		Operacao op = Operacao.MULTIPLICACAO;
		
		double res = op.calcular(10.3, 30.4);
		System.out.println("O resultado da soma eh "+ res);
	}

}
