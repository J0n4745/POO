package exercicio02;

import java.util.Scanner;

public class CriarDisciplinaTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CriarDisciplina myDisciplina = new CriarDisciplina();
		
		System.out.println("Código da disciplina: ");
		String myCod = input.nextLine();
		myDisciplina.setCod(myCod);
		
		System.out.println("Nome da disciplina: ");
		String myNome = input.nextLine();
		myDisciplina.setNome(myNome);
		
		System.out.println("Presencial ou à distância: ");
		String myMod = input.nextLine();
		myDisciplina.setMod(myMod);
		
		System.out.println("Carga horária da disciplina: ");
		String myCarga = input.nextLine();
		myDisciplina.setCarga(myCarga);
		
		System.out.println("Conteúdo programático da disciplina: ");
		String myCp = input.nextLine();
		myDisciplina.setCp(myCp);
		
		System.out.println(myDisciplina);
		
		input.close();
	}
}