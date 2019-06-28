package Exercicio3;

public class Trapezio {
	
	double baseMaior;
	double baseMenor;
	double altura;
	double area;
	
	double calculaArea(){
		area = ((baseMaior + baseMenor) * altura) / 2;
		return area;
	}

}
