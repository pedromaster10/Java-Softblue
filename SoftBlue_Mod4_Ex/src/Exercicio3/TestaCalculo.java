package Exercicio3;

public class TestaCalculo {

	public static void main(String[] args) {
		
		Circunferencia circun = new Circunferencia(4);
		double areaCirc = circun.calculaArea();
		System.out.println("A area da ciircunferencia eh: " + areaCirc);
	
		Quadrado quadrado = new Quadrado(5);
		double areaQuad = quadrado.calculaArea();
		System.out.println("A area do quadrado eh: " + areaQuad);
		
		Triangulo triangulo = new Triangulo(10,5);
		double areaTri = triangulo.calculaArea();
		System.out.println("A area do triangulo eh: " + areaTri);
		
		Trapezio trapezio = new Trapezio(8, 6, 12);
		double areaTra = trapezio.calculaArea();
		System.out.println("A area do trapezio eh: " + areaTra);

	}

}
