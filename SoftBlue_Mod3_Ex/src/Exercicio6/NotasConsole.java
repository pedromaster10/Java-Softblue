package Exercicio6;

public class NotasConsole {
	
	public static void main(String [] args) {
	
<<<<<<< HEAD
	double TotalNotas = 0.0;
	int contaNotas = 0;
	double nota = 0;
=======
	double totalNotas = 0.0;
	int contaNotas = 0;
	double nota = 0.0;
>>>>>>> 1425c6b01daea31cc1a869adc04bacc3d10a67b8
	
	while (nota != -1) {
		System.out.println("Digite uma nota: ");
		nota  = Console.readDouble();
<<<<<<< HEAD
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota Invalida!");
			continue;
		}
		TotalNotas += nota;
		contaNotas++;
=======
		contaNotas++;
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota invalida!");
			continue;
		}
		//acumula o valor da soma das notas
		totalNotas += nota;
		
>>>>>>> 1425c6b01daea31cc1a869adc04bacc3d10a67b8
	}
	
	double media = TotalNotas / contaNotas;
	System.out.println("A media das notas eh "+ media);
	}
}
