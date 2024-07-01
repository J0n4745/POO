package exercicio03;

public class Calculadora {
	
	//marca, modelo, tipo (básica, financeira, científica, etc.) e memória interna (em megabytes)
	String marca, modelo, tipo, memória;
	double a, b;
	
	public Calculadora(String marca, String modelo, String tipo, String memória) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memória = memória;
	}
	
	public double soma(double a, double b) {
		return a + b;
	}
	
	public double subtração(double a, double b) {
		return a - b;
	}
	
	public double multiplicação(double a, double b) {
		return a * b;
	}
	
	public double divisão(double a, double b ) {
		return a / b;
	}
	
	public String toString() {
		return "Marca: " + marca + "\n"
				+ "Modelo: " + modelo + "\n"
				+ "Tipo: " + tipo + "\n"
				+ "Memória ram: " + memória +"\n";
	}
}
