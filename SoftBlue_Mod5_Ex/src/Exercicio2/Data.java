package Exercicio2;

public class Data {
	private int dia, mes, ano;
	private int hora, minuto, segundo;
	final static int FORMATO_12H = 0;
	final static int FORMATO_24H = 12;
		
		
	public Data(int dia,int mes,int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	
	public void imprimir(final int formato) {
			
	}
}
