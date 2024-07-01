package exercício03;

import java.util.Scanner;

public class ContaBancáriaTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Endereço endereço01 = new Endereço("Av Balduíno Taques", 324, "Centro", "Ponta Grossa", "Paraná");
		Titular titular01 = new Titular("999.767.018-37", "1.234.432-1", "Nelson Piquet", "1/09/1957", 
				"Masculino", 25000.00, endereço01);
		ContaBancária conta01 = new ContaBancária(1234, titular01, 0);
		
		int opcao;
		
		do {
			System.out.printf("%n\tDigite 1 para DEPÓSITO%n\tDigite 2 para SAQUE%n"
					+ "\tDigite 3 para DADOS DA CONTA %n\tDigite 4 para Sair%n");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o valor a ser depositado: ");
					double myValorDeposito = input.nextDouble();
					conta01.deposito(myValorDeposito);
					break;
				
				case 2:
					System.out.println("Digite o valor a ser sacado: ");
					double myValorSaque = input.nextDouble();
					conta01.saque(myValorSaque);
					break;
				
				case 3:
					conta01.imprimirDados();
					break;
			
				case 4:
					System.out.printf("%nConte Sempre com a Gente!%nAté a Próxima!");
					break;
				
				default:
					System.out.println("%nOpção inválida!");
					break;
			}
		} while(opcao != 4);
		
		input.close();
	}

}
