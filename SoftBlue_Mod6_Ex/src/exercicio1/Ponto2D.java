package exercicio1;

public class Ponto2D {
	double cordX;
	double cordY;
	
	public Ponto2D(double cordX, double cordY) {
		this.cordX = cordX;
		this.cordY = cordY;
	}
	
	@Override
	public String toString() {
				String cordenadas = "Coordenada x: "+Double.toString(this.cordX)+
						" Coordenada y: "+ Double.toString(this.cordY);
				return cordenadas;
	}
	
}
