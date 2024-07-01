package exercício03;

public class ContaBancária {
	
	private int número;
	private Titular titular;
	private double saldo;
	
	public ContaBancária(int número, Titular titular, double saldo) {
		super();
		this.número = número;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNúmero() {
		return número;
	}
	public void setNúmero(int número) {
		this.número = número;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque (double valorSaque) {
		if(saldo >= valorSaque) {
			saldo -= valorSaque;
			System.out.printf("%nSaque de %.2f realizado com sucesso. Saldo atual: %.2f%n", valorSaque, saldo);
		}
		
		else
			System.out.println("%nSaldo Insuficiente");
		
	}
	
	public double deposito (double valorDeposito) {
		saldo += valorDeposito;
		System.out.printf("%nDepósito de %.2f realizado com sucesso. Seu saldo atual é de %.2f",valorDeposito, 
				saldo);
		return saldo;
	}
	
	public void imprimirDados() {
		System.out.println("DADOS DA CONTA");
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println("Número da Conta: " + número);
		System.out.println("Saldo: " + this.saldo + "\n");
		System.out.println("DADOS DO TITULAR");
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println(this.titular);
		System.out.println("ENDEREÇO DO TITULAR");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(this.titular.getEndereço());
	}

}
