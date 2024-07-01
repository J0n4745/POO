package exercicio01;

public class CadastrarFuncionario {
	
	private int reg, num;
	private String nome, nasc, sexo, setor, tel;
	private String rua, bairro, cidade, estado;
	
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNasc() {
		return nasc;
	}
	public void setNasc(String nasc) {
		this.nasc = nasc;
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
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return "--------------------------------" + "\n"
				+ "Dados do funcionário" + "\n"
				+ "Registro: " + reg + "\n" 
				+ "Nome: " + nome + "\n"
				+ "Telefone: " + tel + "\n" 
				+ "Nasc: " + nasc + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "Setor: " + setor + "\n"
				+ "Rua: " + rua + "\n"
				+ "Número: " + num + "\n"
				+ "Bairro: " + bairro + "\n"
				+ "Cidade: " + cidade + "\n"
				+ "Estado: " + estado;
	}
}