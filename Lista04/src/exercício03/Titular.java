package exercício03;

public class Titular {
	private String cpf; 
	private String rg;
	private String nome;
	private String dataDeNascimento; 
	private String sexo;
	private double rendaMensal; 
	
	private Endereço endereço;
	
	public Titular(String cpf, String rg, String nome, String dataDeNascimento, String sexo, double rendaMensal,
			Endereço endereço) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereço = endereço;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	
	public String toString() {
		return "Cpf: " + cpf + "\n"
		+ "RG: " + rg + "\n"
		+"Nome: " + nome + "\n"
		+ "Data de Nascimento: " + dataDeNascimento + "\n"
		+ "Sexo: " + sexo + "\n"
		+ "Renda Mensal: " + rendaMensal + "\n";
	}
}
