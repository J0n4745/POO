package exercício01;

public class CadastrarFuncionário {
	
	private int registro;
	private String nome;
	private String dataDeNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	
	private Endereço endereço;
	
	public CadastrarFuncionário(int registro, String nome, String dataDeNascimento, String sexo, String setor, 
			String telefone, Endereço endereço) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereço = endereço;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	
	public void imprimirDados() {
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataDeNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Logradouro: " + this.endereço.getLogradouro());
		System.out.println("Número: " + this.endereço.getNúmero());
		System.out.println("Bairro: " + this.endereço.getBairro());
		System.out.println("Cidade: " + this.endereço.getCidade());
		System.out.println("Unidade federativa: " + this.endereço.getUnidadeFederativa());
	}
	
	
	
	

}
