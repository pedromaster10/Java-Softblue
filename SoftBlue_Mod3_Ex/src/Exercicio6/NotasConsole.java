package Exercicio6;

public class NotasConsole {
	
	public static void main(String [] args) {
	

	double TotalNotas = 0.0;
	int contaNotas = 0;
	double nota = 0;
	
	while (nota != -1) {
		System.out.println("Digite uma nota: ");
		nota  = Console.readDouble();

		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota Invalida!");
			continue;
		}
		TotalNotas += nota;
		contaNotas++;

		contaNotas++;
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota invalida!");
			continue;
		}
		//acumula o valor da soma das notas
		TotalNotas += nota;
	}
	
	double media = TotalNotas / contaNotas;
	System.out.println("A media das notas eh "+ media);
	}
}
