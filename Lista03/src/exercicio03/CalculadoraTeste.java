package exercicio03;

import java.util.Scanner;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculadora myCalc = new Calculadora("Casio", "fx - CG50", "Gráfica", "61Kb");
		
		System.out.println("Digite o valor de 'a':" );
		double a = input.nextDouble();
		
		System.out.println("Digite o valor de 'b': ");
		double b = input.nextDouble();
		
		System.out.printf("\n");
		
		System.out.println("O resultado da soma é: ");
		System.out.println(myCalc.soma(a, b));
		System.out.println("O resultado da subtração é: ");
		System.out.println(myCalc.subtração(a, b));
		System.out.println("O resultado da multiplicação é: ");
		System.out.println(myCalc.multiplicação(a, b));
		System.out.println("O resultado da divisão é: ");
		System.out.println(myCalc.divisão(a, b));
		
		System.out.printf("\n");
		
		System.out.println("Calculado em uma calculadora de");
		System.out.println(myCalc.toString());
		
		input.close();
	}
}
