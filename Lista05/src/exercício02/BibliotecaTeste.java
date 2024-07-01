package exercício02;

public class BibliotecaTeste {
	
	public static void main(String[] args) {
	
		Livro livro01 = new Livro("Java - Como Programar", "Paul Deitel", 2017, "Pearson Education", 970);
		Livro livro02 = new Livro("The Unified Modeling Language User Guide", "Grady Booch", 1998,
				"Addison Wesley", 512);
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.incluirLivro(livro01);
		biblioteca.incluirLivro(livro02);
		
		biblioteca.verificarDisponibilidade("Java - Como Programar");
		
		biblioteca.emprestarLivro("Java - Como Programar", 1307);
		
		biblioteca.verificarDisponibilidade("Java - Como Programar");
		
		biblioteca.devolverLivro("Java - Como Programar", 1308);
	}

}
