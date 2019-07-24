package Exercicio1;

public class Triangulo implements AreaCalculavel{
	
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

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
