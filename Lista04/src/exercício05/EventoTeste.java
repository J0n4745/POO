package exercício05;

public class EventoTeste {
	
	public static void main(String[] args) {
	
		Endereço endereço01 = new Endereço("Rua João Gava", 970, "Boa Vista", "Curitiba", "Paraná");
		Local local01 = new Local("Pedreira Paulo Leminski", 30000, endereço01);
		Artista artista01 = new Artista("Black Sabbath", "Inglesa", "Black Sabbath were an English "
				+ "rock band formed in Birmingham in 1968 by guitarist Tony Iommi, drummer Bill Ward, "
				+ "bassist Geezer Butler and vocalist Ozzy Osbourne.");
		Evento evento01 = new Evento("End of the World", "13/07/2024", 16, local01, artista01);
		
		evento01.vendaIngresso();
	}
}
