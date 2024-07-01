package exercício02;

public class Professor {
	
	private int registro;
	private String nome;
	private String dataDeNascimento;
	private double salário;
	
	public Professor(int registro, String nome, String dataDeNascimento, double salário) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.salário = salário;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
}
