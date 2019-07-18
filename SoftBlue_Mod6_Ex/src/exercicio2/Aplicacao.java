package exercicio2;

public class Aplicacao {
	
	public static void main (String[] args) {
		
		Motocicleta moto = new Motocicleta();
		Onibus busao = new Onibus();
		Automovel carro = new Automovel();
		
		moto.ligar();
		moto.isLigado();
		moto.desligar();
		moto.isLigado();
		
		busao.ligar();
		busao.isLigado();
		busao.desligar();
		busao.isLigado();
		
		carro.ligar();
		carro.isLigado();
		carro.desligar();
		carro.isLigado();
	}
}
