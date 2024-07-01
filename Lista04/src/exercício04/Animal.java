package exercício04;

public class Animal {
	
	private String nome;
	private int idade;
	private String sexo;
	
	private Dono dono;
	private Tratamento tratamento;
	
	public Animal(String nome, int idade, String sexo, Dono dono, Tratamento tratamento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
		this.tratamento = tratamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Dono getDono() {
		return dono;
	}
	
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	public Tratamento getTratamento() {
		return tratamento;
	}
	
	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}
}
