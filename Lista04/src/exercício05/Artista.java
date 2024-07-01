package exercício05;

public class Artista {
	
	private String nome;
	private String nacionalidade;
	private String biografia;
	
	public Artista(String nome, String nacionalidade, String biografia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}
