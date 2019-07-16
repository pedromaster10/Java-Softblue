package exercicio4;

public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	public double getNotaParte1() {
		return notaParte1;
	}
	public void setNotaParte1(double notaParte1) {
		this.notaParte1 = notaParte1;
	}
	public double getNotaParte2() {
		return notaParte2;
	}
	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}
	
	double calcularNotaTotal() {
		double total = getNotaParte1() + getNotaParte2();
		return total;
	}
	
}
