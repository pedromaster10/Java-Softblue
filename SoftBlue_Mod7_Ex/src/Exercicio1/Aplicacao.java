package Exercicio1;

public class Aplicacao {
	
	public static void main (String[] args) {
	
	Circunferencia circu = new Circunferencia(15);
	Triangulo tri = new Triangulo(54, 21);
	Quadrado quad = new Quadrado(46);
	
	System.out.println("Area da circunferencia: "+ circu.calcularArea());
	System.out.println("Area do triangulo: "+ tri.calculaArea());
	System.out.println("Area do quadrado: "+ quad.calcularArea());
	
	}
}
