package exercício02;

public class Disciplina {
	
	private int código;
	private String nome;
	private String modalidade;
	private int cargaHorária;
	
	private Professor professor;

	public Disciplina(int código, String nome, String modalidade, int cargaHorária, Professor professor) {
		super();
		this.código = código;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHorária = cargaHorária;
		this.professor = professor;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getCargaHorária() {
		return cargaHorária;
	}

	public void setCargaHorária(int cargaHorária) {
		this.cargaHorária = cargaHorária;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void imprimirDados() {
		System.out.println("RELATÓRIO DA DISCIPLINA");
		System.out.println("Código: " + this.código);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga horária: " + this.cargaHorária);
		System.out.println();
		System.out.println("PROFESSOR DA DISCIPLINA");
		System.out.println("Número de registro: " + professor.getRegistro());
		System.out.println("Nome: " + this.professor.getNome());
		System.out.println("Data de nascimento: " + this.professor.getDataDeNascimento());
		System.out.println("Salário: " + this.professor.getSalário());
	}
}
