package Exercicio6;

public class NotasConsole {
	
	public static void main(String [] args) {
	
	double totalNotas = 0.0;
	int contaNotas = 0;
	double nota = 0.0;
	
	while (nota != -1) {
		System.out.println("Digite uma nota: ");
		nota  = Console.readDouble();
		contaNotas++;
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota invalida!");
			continue;
		}
		//acumula o valor da soma das notas
		totalNotas += nota;
		
	}
	
	}
}
