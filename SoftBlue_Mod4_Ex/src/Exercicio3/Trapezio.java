package Exercicio3;

public class Trapezio {

	double baseMaior;
	double baseMenor;
	double altura;
	double area;
	
	public Trapezio(double baseMaior,double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	
	
	double calculaArea(){
		area = ((baseMaior + baseMenor) * altura) / 2;
		return area;
	}

}
