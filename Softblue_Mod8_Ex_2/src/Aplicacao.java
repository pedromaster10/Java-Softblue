
public class Aplicacao {
	
	public static void main(String[] args) {
		
		try {
			
			Object o = null;
			o.toString();
			
		}catch (Exception e) {
			System.out.println("ocorreu um erro: "+ e.getMessage());
			
		}
		
		
	}
}
