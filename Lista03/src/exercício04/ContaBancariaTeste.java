package exercício04;

import java.util.Scanner;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ContaBancaria myContaBancaria01 = new ContaBancaria("001", "1234-5", 0);
		
		int opcao;
		
		do {
			System.out.printf("%nDigite 1 para DEPÓSITO%nDigite 2 para SAQUE%nDigite 3 para SALDO%n"
					+ "Digite 4 para Sair%n");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o valor a ser depositado: ");
					double myValorDeposito = input.nextDouble();
					myContaBancaria01.deposito(myValorDeposito);
					break;
				
				case 2:
					System.out.println("Digite o valor a ser sacado: ");
					double myValorSaque = input.nextDouble();
					myContaBancaria01.saque(myValorSaque);
					break;
				
				case 3:
					System.out.printf("Seu saldo atual é: %.2f", myContaBancaria01.getSaldo());
					break;
			
				case 4:
					System.out.printf("Conte Sempre com a Gente!%nAté a Próxima!");
					break;
				
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}

		while(opcao != 4);
		
		input.close();
	}
}