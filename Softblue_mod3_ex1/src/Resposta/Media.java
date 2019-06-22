package Resposta;


public class Media {
	
		private double peso1 = 3;
		private double peso2 = 2;
		private double peso3 = 5;
		
		double calcularMedia(double nota1, double nota2, double nota3){
			nota1 *= peso1;
			nota2 *= peso2;
			nota3 *= peso3;
			double resultado = nota1 + nota2 + nota3 / 3;
			return resultado;
		}

}
