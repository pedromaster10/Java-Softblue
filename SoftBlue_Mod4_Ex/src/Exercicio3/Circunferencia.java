package Exercicio3;

public class Circunferencia {
	double raio;
	double pi = 3.14159;
	double area;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	double calculaArea() {
		area =  pi * (raio * raio);
		return area;
	}

}
