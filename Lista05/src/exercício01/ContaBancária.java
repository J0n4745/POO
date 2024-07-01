package exercício01;

public class ContaBancária {
	
	private int numeroConta;
	private double saldo;
	private Titular titular;
	
	public ContaBancária(int numeroConta, double saldo, Titular titular) {
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
		this.titular = titular;
	}
	
	public ContaBancária(int numeroConta, Titular titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitulares() {
		return titular;
	}
	
	public void verificarSaldo() {
		System.out.println("Conta: " + this.numeroConta + "\n"
				+ "Saldo: " + this.saldo);
	}
	
	public void realizarSaque(double valorSaque) {
		if(valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
			
			System.out.println("Conta: " + this.numeroConta + "\n"
					+ "Saque de R$" + valorSaque + " realizado com sucesso.\n");
		}
	}
	
	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
		
		System.out.println("Conta: " + this.numeroConta + "\n"
				+ "Saque de R$" + valorDeposito + " realizado com sucesso.\n");
	}
	
}