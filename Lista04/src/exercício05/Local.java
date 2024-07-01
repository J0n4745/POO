package exercício05;

public class Local {
	
	private String nomeDoLocal;
	private int capacidadeMáxima;
	
	private Endereço endereço;

	public Local(String nomeDoLocal, int capacidadeMáxima, Endereço endereço) {
		super();
		this.nomeDoLocal = nomeDoLocal;
		this.capacidadeMáxima = capacidadeMáxima;
		this.endereço = endereço;
	}

	public String getNomeDoLocal() {
		return nomeDoLocal;
	}

	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}

	public int getCapacidadeMáxima() {
		return capacidadeMáxima;
	}

	public void setCapacidadeMáxima(int capacidadeMáxima) {
		this.capacidadeMáxima = capacidadeMáxima;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

}
