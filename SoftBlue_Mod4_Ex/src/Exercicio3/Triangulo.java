package Exercicio3;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = base;
	}
	
	double calculaArea() {
		area = (base * altura) /  2;
		return area;
	}
	
}
