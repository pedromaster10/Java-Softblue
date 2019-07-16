package Exercicio2;

public class Fracao {
	int numerador;
	int denominador;
	
	Fracao(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	Fracao() {
	}
	
	Fracao multiplicafracao(Fracao f1, Fracao f2) {
		 
		 Fracao resultado = new Fracao();
		 
		 resultado.numerador = f1.numerador * f2.numerador;
		 resultado.denominador = f1.denominador * f2.denominador;
		 
		 return resultado;
	}
}
