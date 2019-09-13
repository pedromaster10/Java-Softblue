package exercicio3;

public class Aplicacao {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Porta portinha = new Porta(40, 10);
		portinha.abrir();
		
		System.out.println("a altura da portinha eh: "+portinha.getAltura());
		System.out.println("a largura da portinha eh: "+portinha.getLargura());
		System.out.println("a portinha esta aberta? "+portinha.isAberta());
		
		Porta portao = (Porta) portinha.clone();

		System.out.println("a altura do portao eh: "+portao.getAltura());
		System.out.println("a largura do portao eh: "+portao.getLargura());
		System.out.println("o portao esta aberto? "+portao.isAberta());
	}

}
