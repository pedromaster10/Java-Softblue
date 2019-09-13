public class Aplicacao {
	
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria(1000);
		ContaBancaria c2 = new ContaBancaria(2000);
		
		try {
			c1.depositar(1000);
			c1.depositar(-10);
			
		} catch (ValorInvalidoException e) {
			
			System.out.println("Ocorreu um erro: "+ e.getMessage() + e.getValorInvalido());
		}
		
		System.out.println("O salto atual em conta eh: "+ c1.getSaldo());
		
		try {
			c1.sacar(5000);
			c1.sacar(-5000);
			
		} catch (SaldoInsuficienteException e) {
			
			System.out.println("Ocorreu um erro: "+ e.getMessage() + e.getSaldoDisponivel());
		} catch (ValorInvalidoException e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage() + e.getValorInvalido());
		}
		
		try {
			c2.transferir(200, c1);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("O salto atual em conta eh: "+ c1.getSaldo());
	}
}