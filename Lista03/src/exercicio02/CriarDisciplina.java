package exercicio02;

public class CriarDisciplina {
	
	private String cod, nome, modalidade, carga, cp;
	
	public String getCod () {
		return cod;
	}
	
	public void setCod (String cod) {
		this.cod = cod;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCp() {
		return cp;
	}
	
	public void setCp (String cp) {
		this.cp = cp;
	}
	
	public String getCarga() {
		return carga;
	}
	
	public void setCarga (String carga) {
		this.carga = carga;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setMod(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String toString() {
		return "---------------------------------------------------" + "\n"
				+ "Dados da disciplina" + "\n"
				+ "Código da disciplina: " + cod + "\n"
				+ "Nome da disciplina: " + nome + "\n"
				+ "Modalidade: " + modalidade + "\n"
				+ "Carga horária: " + carga + "\n"
				+ "Conteúdo Programático: " + cp + "\n";
	}
}
