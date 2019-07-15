package Exercicio1;

public class Lampada {
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada =  ligada;
	}
	

	public boolean isLigada() {
		return ligada;
	}

	public void imprimir() {
		if (isLigada())
			System.out.println("Lampada ligada");
		else 
			System.out.println("Lampada desligada");
	}

	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	
}
