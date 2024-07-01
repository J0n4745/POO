package exercício01;

public class BancoTeste {
	
	public static void main(String[] args) {
		
		Titular titular01 = new Titular("Lando Norris", "986.789.098.34");		
		Banco banco01 = new Banco();
		
		banco01.criarConta(12345, titular01);
		
		banco01.verificarSaldo(12345);
		
		banco01.realizarDeposito(12345, 500.00);
		banco01.realizarSaque(12345, 300.00);
		
		banco01.realizarSaque(12345, 300.00);
	}
}
