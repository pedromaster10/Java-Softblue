package Exercicio1;

public class Aplicacao {

	public static void main(String[] args) {
		
		Relogio r1 = new Relogio();
		
		r1.acertaRelogio(22, 5, 40);
		
		//mostra as posi��es dos ponteiros do rel�gio
		System.out.println("Posi��o da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posi��o do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posi��o do segundo: " + r1.ponteiroSegundo.posicao);
		
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.LerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		

	}

}
