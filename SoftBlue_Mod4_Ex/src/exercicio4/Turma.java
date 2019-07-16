package exercicio4;

public class Turma {
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();;
	Aluno aluno3 = new Aluno();;
	
	double calculaMedia() {
		double mediaTurma = (aluno1.calcularMedia() + aluno2.calcularMedia() +
				aluno3.calcularMedia()) / 3;
		return mediaTurma;
	}
}
