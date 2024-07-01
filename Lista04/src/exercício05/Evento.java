package exercício05;

import java.util.Scanner;

public class Evento {
	
	 private String nomeDoEvento;
	 private String data;
	 private int classificaçãoEtária;
	 private int ingressosDisponíveis;
	 
	 private Local local;
	 private Artista artista;
	 
	 public Evento(String nomeDoEvento, String data, int classificaçãoEtária, Local local, Artista artista) {
		super();
		this.nomeDoEvento = nomeDoEvento;
		this.data = data;
		this.classificaçãoEtária = classificaçãoEtária;
		this.setIngressosDisponíveis(local.getCapacidadeMáxima());
		this.local = local;
		this.artista = artista;
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getClassificaçãoEtária() {
		return classificaçãoEtária;
	}

	public void setClassificaçãoEtária(int classificaçãoEtária) {
		this.classificaçãoEtária = classificaçãoEtária;
	}
	
	public int getIngressosDisponíveis() {
		return ingressosDisponíveis;
	}

	public void setIngressosDisponíveis(int ingressosDisponíveis) {
		this.ingressosDisponíveis = ingressosDisponíveis;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	public void vendaIngresso() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos ingressos deseja comprar?");
		int vendaIngresso = input.nextInt();
		
		if(vendaIngresso <= this.ingressosDisponíveis) {
			this.ingressosDisponíveis--;
			System.out.println("Ingressos comprados com sucesso. \nTenha um bom show");
		} else
			System.out.println("Número de ingressos indisponível");
		
		input.close();
	}
}
