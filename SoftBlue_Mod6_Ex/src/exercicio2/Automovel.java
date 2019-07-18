package exercicio2;

public class Automovel extends Veiculo {
	
	@Override
	void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Automovel ligando");
	}
	
	@Override
	void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Automovel desligando");
	}
	
}
