package exercício02;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
	
	private List<Livro> acervo;
	
	public Biblioteca() {
		this.acervo = new ArrayList<Livro>();
	}
	
	public void incluirLivro(Livro livro) {
		acervo.add(livro);
	}
	
	public void verificarDisponibilidade(String titulo) {
		for(Livro livro : acervo) {
			if(livro.getTitulo().equals(titulo)) {
				if(livro.isDisponivel()) {
					System.out.println("O livro" + titulo + " está disponível para empréstimo");
				} else {
					System.out.println("Livro indisponível!");
				}
				break;
			}
		}
		System.out.println("Livro não encontrado.");
	}
	
	public void emprestarLivro(String titulo, int dataEmprestimo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestar(dataEmprestimo);
                break;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado na biblioteca.");
    }
	
	public void devolverLivro(String titulo, int dataDevolucao) {
		for(Livro livro : acervo) {
			if(livro.getTitulo().equals(titulo)) {
				livro.devolver(dataDevolucao);
				break;
			}
		}
		System.out.println("Livro não encontrado.");
	}

}
