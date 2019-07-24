package Exercicio1;

public class Circunferencia  implements AreaCalculavel{
	double raio;
	double pi = 3.14159;
	double area;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		area =  pi * (raio * raio);
		return area;
		
	}

}
