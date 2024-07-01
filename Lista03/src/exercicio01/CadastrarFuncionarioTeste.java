package exercicio01;

import java.util.Scanner;

public class CadastrarFuncionarioTeste {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CadastrarFuncionario myCadastro = new CadastrarFuncionario();
		
		System.out.println("Digite o número de registro do funcionário: ");
		int myReg = input.nextInt();
		myCadastro.setReg(myReg);
		System.out.println();
		
		System.out.println("Digite o nome do funcionário: ");
		input.nextLine();
		String myNome = input.nextLine();
		myCadastro.setNome(myNome);
		
		System.out.println("Digite a data de nascimento do funcionário: ");
		String myNasc = input.nextLine();
		myCadastro.setNasc(myNasc);
		
		System.out.println("Digite o sexo do funcionário: ");
		String mySexo = input.nextLine();
		myCadastro.setSexo(mySexo);
		
		System.out.println("Digite o setor do funcionário: ");
		String mySetor = input.nextLine();
		myCadastro.setSetor(mySetor);
		
		System.out.println("Digite o telefone do funcionário: ");
		String myTel = input.nextLine();
		myCadastro.setTel(myTel);
		System.out.println();
		
		System.out.println("");
		
		myCadastro.setRua("Leandro");
		myCadastro.setNum(148);
		myCadastro.setBairro("Contorno");
		myCadastro.setCidade("Ponta Grossa");
		myCadastro.setEstado("Paraná");
		
		System.out.println(myCadastro);
		
		input.close();
	}
}