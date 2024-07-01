package exercício04;

public class ContaBancaria {
	
	private String agencia;
	private String conta;
	private double saldo;
	private double deposito;
	private double saque;
	
	public ContaBancaria(String agencia, String conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public void saque (double valorSaque) {
		if(saldo >= valorSaque) {
			saldo -= valorSaque;
			System.out.printf("Saque de %.2f realizado com sucesso. Saldo atual: %.2f%n", valorSaque, saldo);
		}
		
		else
			System.out.println("Saldo Insuficiente");
		
	}
	
	public double deposito (double valorDeposito) {
		saldo += valorDeposito;
		System.out.printf("Depósito de %.2f realizado com sucesso. Seu saldo atual é de %.2f",valorDeposito, saldo);
		return saldo;
	}
	
	public void consultaSaldo (double saldo) {
		System.out.printf("Seu saldo atual é de %.2f", saldo);
	}
}