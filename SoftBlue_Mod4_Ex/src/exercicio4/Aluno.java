package exercicio4;

public class Aluno {
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();
	
	double calcularMedia() {
		double mediaAluno = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2;
		return mediaAluno;
	}
}
