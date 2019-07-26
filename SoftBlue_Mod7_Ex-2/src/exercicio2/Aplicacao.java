package exercicio2;

public class Aplicacao {

	public static void main(String[] args) {
			
		ContaBancaria contaBradesco = new ContaCorrente(100);
		ContaBancaria poupancaCaixa = new ContaInvestimento(200);
			
		System.out.println("saldo da conta bradesco: "+contaBradesco.getSaldo());
		System.out.println("saldo da conta poupanca: "+poupancaCaixa.getSaldo());
		
		contaBradesco.depositar(50);
		poupancaCaixa.depositar(50);
		System.out.println("saldo da conta bradesco: "+contaBradesco.getSaldo());
		System.out.println("saldo da conta poupanca: "+poupancaCaixa.getSaldo());
		
		contaBradesco.sacar(100);
		poupancaCaixa.sacar(35);
		
		System.out.println("saldo da conta bradesco: "+contaBradesco.getSaldo());
		System.out.println("saldo da conta poupanca: "+poupancaCaixa.getSaldo());
		
		poupancaCaixa.transferir(100, contaBradesco);
		
		System.out.println("saldo da conta bradesco: "+contaBradesco.getSaldo());
		System.out.println("saldo da conta poupanca: "+poupancaCaixa.getSaldo());
		
		poupancaCaixa.calcularSaldo();
		contaBradesco.calcularSaldo();
		
		System.out.println("saldo da conta bradesco: "+contaBradesco.getSaldo());
		System.out.println("saldo da conta poupanca: "+poupancaCaixa.getSaldo());
	}

}
