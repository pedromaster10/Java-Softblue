package Exercicio1;

public class Relogio {
	
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	void acertaRelogio(int hora, int minuto, int segundo) {
		
		hora = hora % 12; //calcula o modulo da hora
		
		ponteiroHora.posicao = hora;
		
		ponteiroMinuto.posicao = minuto / 5; //transforma o minuto em posicao de ponteiro
		
		ponteiroSegundo.posicao = segundo / 5; //transforma o segundo em posicao de ponteiro
		
	}
	
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5; //transforma a posição em minuto
	}
	
	int LerSegundo() {
		return ponteiroSegundo.posicao * 5; //transforma a posicao em segundo
	}
}
