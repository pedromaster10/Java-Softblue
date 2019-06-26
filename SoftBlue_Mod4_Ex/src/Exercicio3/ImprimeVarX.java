/* 	Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve
	iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo
	somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa
	termina assim que x for maior que 1000.*/
package Exercicio3;

import java.util.Scanner;

/* versao com if else

public class ImprimeVarX {

	public static void main(String[] args) {
		
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: "); 
		x = sc.nextInt();
		while (x < 1000) {
			if (x % 2 == 0) {
				x = x + 5;
			} else {
				x = x * 2;
			}
		System.out.println("O valor de x eh: "+x);
		}		

	}

}
*/
//Versao com switch case.
public class ImprimeVarX {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: "); 
		x = sc.nextInt();
		
		while (x < 1000) {
			switch (x % 2) {
			case 0:
				x = x + 5;
				break;
			default:
				x = x * 2;
			}
			
			System.out.print(x + ", ");
		}
	}

}