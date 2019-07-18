package exercicio2;

public class Veiculo {
	
	private boolean ligado;
	
	void ligar() {
		this.ligado = true;
	}
	
	void desligar() {
		this.ligado = false;
	}
	
	public boolean isLigado() {
		if(ligado == true) {
		System.out.println("Esta ligado");
		} else {
			System.out.println("Esta desligado");
			
		}
		return ligado;
	}
}
