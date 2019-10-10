
public class Matematica {
	
	public enum TipoAngulo {
		GRAUS,
		RADIANOS;
	}
	
	public static Double converterAngulo (Double angulo, TipoAngulo tipo) {

		if (tipo == TipoAngulo.RADIANOS) {
			return  Math.toDegrees(angulo);
			
		} else {
			return  Math.toRadians(angulo);
		}
		
	}
	
	public static Integer somar (Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3;
	} 
	
	public static Integer converterBinarioParaDecimal (String numBinario) {
		int resposta = Integer.parseInt(numBinario, 2);	
		return resposta;
	}
}
