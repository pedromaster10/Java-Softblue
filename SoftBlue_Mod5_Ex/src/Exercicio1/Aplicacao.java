package Exercicio1;

public class Aplicacao {
	
	public static void main(String[] args) {
		Lampada florescente = new Lampada(true);
		
		florescente.imprimir();
		florescente.desligar();
		florescente.imprimir();
		florescente.ligar();
		florescente.imprimir();
	}
}
