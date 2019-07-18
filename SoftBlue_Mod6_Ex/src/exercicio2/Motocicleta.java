package exercicio2;

public class Motocicleta extends Veiculo {
	
	@Override
	void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Motocicleta ligando");
	}
	
	@Override
	void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Motocicleta desligando");
	}
}
