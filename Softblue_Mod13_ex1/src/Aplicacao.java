import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		String produto = "";
		do {
			System.out.println("Escreva o nome de um item e pressione ENTER: ");
			
			Scanner sc = new Scanner(System.in);
			produto = sc.nextLine();
		} while (produto != "casa");
	}

}
	