package exercício02;

public class DisciplinTeste {
	
	public static void main(String[] args) {
		
		Professor professor01 = new Professor(1234, "Christian Horn", "13/08/1976",7221.14);
		Disciplina disciplina01 = new Disciplina(32, "Algoritmos", "Presencial", 90, professor01);
		disciplina01.imprimirDados();
	}

}
