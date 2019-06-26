package Exercicio2;

public class CalculaFracao {

	public static void main(String[] args) {

		Fracao f1 = new Fracao(2,3);
		
		Fracao f2 = new Fracao(4,5);
		
		System.out.println("A primeira fracao tem valor: "+ f1.numerador+
				"/"+ f1.denominador);
		
		System.out.println("A segunda fracao tem valor: "+ f2.numerador
				+"/"+ f2.denominador);
		
		Fracao result = new Fracao();
		result = f1.multiplicafracao(f1, f2);
		
		System.out.println("A multiplicacao das fracoes é igual a: "
				+ result.numerador + "/"+ result.denominador); 
	}

}
