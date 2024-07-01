package exercício01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<ContaBancária> contas;
	
	public Banco() {
		this.contas = new ArrayList<ContaBancária>();
	}

	public List<ContaBancária> getContas() {
		return contas;
	}
	
	public void criarConta (int numeroConta, Titular titular) {
		ContaBancária contas = new ContaBancária(numeroConta, titular);
		
		System.out.println("Conta: " + numeroConta + " criada com sucesso");
	}
	
	public void verificarSaldo(int numeroConta) {
		for(ContaBancária conta : contas ) {
			if(conta.getNumeroConta() == (numeroConta)) {
				conta.verificarSaldo();
				break;
			}
		}
		
		System.out.println("Conta não encontrada!");
	}
	
	public void realizarSaque(int numeroConta, double valorSaque) {
		for(ContaBancária conta : contas) {
			if(conta.getNumeroConta() == (numeroConta)) {
				conta.realizarSaque(valorSaque);
				break;
			}
		}
		
		System.out.println("Conta não encontrada!");
	}
	
	public void realizarDeposito(int numeroConta, double valorDeposito) {
		for(ContaBancária conta : contas) {
			conta.realizarDeposito(valorDeposito);
			break;
		}
		
		System.out.println("Conta não encontrada!");
	}
}
