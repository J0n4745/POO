package exercício02;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	private String editora;
	private int totalDePaginas;
	private boolean disponivel;
	private boolean emprestado;
	private int dataEmprestimo;
	private int dataDevolucao;
	
	public Livro(String titulo, String autor, int anoDePublicacao, String editora, int totalDePaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.editora = editora;
		this.totalDePaginas = totalDePaginas;
		this.disponivel = true;
		this.emprestado = false;
		this.dataEmprestimo = 0;
		this.dataDevolucao = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	
	public boolean isEmprestado() {
		return emprestado;
	}

	public void emprestar(int dataEmprestimo) {
		if(this.disponivel == true) {
			this.disponivel = false;
			this.emprestado = true;
			this.dataEmprestimo = dataEmprestimo;
		}
	}
	
	public void devolver(int dataDevolucao) {
		if(this.emprestado == true) {
			this.disponivel = true;
			this.emprestado = false;
			this.dataDevolucao = dataDevolucao;
			
			int diasAtraso = dataDevolucao - (dataEmprestimo + 7);
			if(diasAtraso > 0) {
				double multa = diasAtraso * 1.50;
				System.out.println("O atraso de " + diasAtraso + " dias gerou uma multa de R$ " + multa);
			} else {
				System.out.println("Livro devolvido no prazo.");
			}
		} else {
			System.out.println("Livro não está emprestado!");
		}
	}	
}
