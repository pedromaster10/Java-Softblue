
public class TerceiroEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int num = 0;
		do {
			System.out.println(num);
			soma += num; 
			num ++;
		} while (soma + num < 100);
		System.out.println("soma é igual a: "+ soma);
	}

}
