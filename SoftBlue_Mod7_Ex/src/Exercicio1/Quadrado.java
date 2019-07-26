package Exercicio1;

public class Quadrado implements AreaCalculavel{
	
	double lado;
	double area;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		area = lado * lado;
		return area;
	}
}
