package Exercicio3;

public class Quadrado {
	
	double lado;
	double area;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	double calculaArea() {
		area = lado * lado;
		return area;
	}
}
