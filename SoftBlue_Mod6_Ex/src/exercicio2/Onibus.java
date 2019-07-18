package exercicio2;

public class Onibus extends Veiculo {
	
	@Override
	void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Onibus esta ligando");
	}
	
	@Override
	void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Onibus desligando");
	}
}
