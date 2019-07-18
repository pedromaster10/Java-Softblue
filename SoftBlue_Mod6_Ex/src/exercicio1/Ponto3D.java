package exercicio1;

public class Ponto3D extends Ponto2D{
	
	double cordZ;

	public Ponto3D(double cordX, double cordY, double cordZ) {
		super(cordX, cordY);
		this.cordZ = cordZ;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String coordenada = super.toString() + " Cordenada Z: "+ this.cordZ;
		return coordenada;
	}

}
