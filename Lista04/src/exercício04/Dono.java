package exercício04;

public class Dono {
	
	 private String cpf;
	 private String nome;
	 private String telefone;
	 private String eMail;
	 
	 private Endereço endereço;

	public Dono(String cpf, String nome, String telefone, String eMail, Endereço endereço) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.eMail = eMail;
		this.endereço = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

}
