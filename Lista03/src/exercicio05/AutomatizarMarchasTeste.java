package exercicio05;

public class AutomatizarMarchasTeste {
	
	public static void main(String[] args) {
		
		AutomatizaMarchas myCarroEletrico = new AutomatizaMarchas();
		
		System.out.printf("Velocidade Inicial: %d%nMarcha Inicial: %d%n%nIniciando Aceleração...%n", 
				myCarroEletrico.getVelocidade(), myCarroEletrico.getMarcha());
		
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		myCarroEletrico.acelerar();
		
		System.out.printf("-----------------------------------------------------------%n"
				+ "Fim da Aceleração %nVelocidade: %d%nMarcha: %d%n", myCarroEletrico.getVelocidade(), 
				myCarroEletrico.getMarcha());
		
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		myCarroEletrico.frear();
		
		System.out.printf("-----------------------------------------------------------%n"
				+ "Fim da Frenagem %nVelocidade: %d%nMarcha: %d%n", myCarroEletrico.getVelocidade(), 
				myCarroEletrico.getMarcha());
	}

}
