package exercicio4;

public class Aplicaçao {

	public static void main(String[] args) {
		Turma turma1 = new Turma();
		turma1.aluno1.prova1.setNotaParte1(4.0);
		turma1.aluno1.prova1.setNotaParte2(2.5);
		
		turma1.aluno1.prova2.setNotaParte1(1.0);
		turma1.aluno1.prova2.setNotaParte2(7.0);
		
		turma1.aluno2.prova1.setNotaParte1(6.5);
		turma1.aluno2.prova1.setNotaParte2(3.5);
		
		turma1.aluno2.prova2.setNotaParte1(0.0);
		turma1.aluno2.prova2.setNotaParte2(3.0);
		
		turma1.aluno3.prova1.setNotaParte1(5.0);
		turma1.aluno3.prova1.setNotaParte2(4.0);
		
		turma1.aluno3.prova2.setNotaParte1(6.0);
		turma1.aluno3.prova2.setNotaParte2(1.5);
		
		
		System.out.println("A media do Aluno 1 eh: "+ turma1.aluno1.calcularMedia());
		System.out.println("A media do Aluno 2 eh: "+ turma1.aluno2.calcularMedia());
		System.out.println("A media do Aluno 3 eh: "+ turma1.aluno3.calcularMedia());
		System.out.println("A media da turma eh: "+ turma1.calculaMedia());

	}

}
