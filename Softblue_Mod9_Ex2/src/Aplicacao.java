public class Aplicacao {
	
	public static void main(String[] args) {
		
		Aplicacao ap = new Aplicacao();
		String teste = ap.processar(null);
		String teste2 = ap.processar("cor");
		String teste3 = ap.processar("familia");
		System.out.println(teste);
		System.out.println(teste2);
		System.out.println(teste3);
	}
	
	
	public String processar(String s) {
		if (s != null) {
			s = s.toUpperCase();
			if (s.length() <= 3) {
				return s; 
			} else {
				StringBuilder stb = new StringBuilder();
				StringBuilder stb2 = new StringBuilder(s);
				stb.append(s.charAt(2));
				stb.append(s.charAt(1));
				stb.append(s.charAt(0));
				stb2.delete(0, 2);
				stb.append(stb2);
				
				s = stb.toString();
				return s;
				
			}
		}
		return null;
	}
}

/* Solução do professor
 * 
 * public class Aplicacao {

	public static void main(String[] args) {

		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefg"));
		
	}
	
	private static String processar(String s) {
		if (s == null) {
			return null;
		}
		
		s = s.toUpperCase();
		
		if (s.length() <= 3) {
			return s;
		}
		
		String s2 = s.substring(0, 3);
		
		StringBuffer sb = new StringBuffer(s2);
		
		sb.reverse();
		
		return sb.toString() + s.substring(3);
	}
}
 * */