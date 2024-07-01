package exercício01;

public class CadastrarFuncionárioTeste {
	
	public static void main(String[] args) {
		
		
		Endereço endereço01 = new Endereço("Av Balduíno Taques", 148, "Centro", "Ponta Grossa", "Paraná");
		CadastrarFuncionário funcionário01 = new CadastrarFuncionário(67812, "Alex Albon", "13/03/1996",
				"Masculino", "Almoxarifado", "(42) 999 99 99 99", endereço01);
		
		funcionário01.imprimirDados();
	}

}
