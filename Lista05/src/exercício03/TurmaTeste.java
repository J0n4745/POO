package exercício03;

public class TurmaTeste {
	
    public static void main(String[] args) {
    	
        Turma turmaPOO = new Turma("Programação Orientada a Objetos");

        System.out.println("MÉDIA DOS ALUNOS:");
        turmaPOO.calcularMediaAlunos();
        
        System.out.println("-------------------------------------------------------------");

        System.out.println("\nMÉDIA DA TURMA:");
        turmaPOO.calcularMediaTurma();
    }
}
