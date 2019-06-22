package Resposta;

import javax.swing.JOptionPane;

public class TestaMedia {
	public static void main (String [] args) {
				
		Media novaMedia = new Media ();
		double resultado = novaMedia.calcularMedia(8.5, 7.5, 6.0);
		
		JOptionPane.showMessageDialog(null,"A media do aluno é "+ resultado);
	}
	

}
