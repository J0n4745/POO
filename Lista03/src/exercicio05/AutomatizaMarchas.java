package exercicio05;

public class AutomatizaMarchas {
	
	private int velocidade;
	private int marcha;
	
	public AutomatizaMarchas(int velocidade, int marcha) {
		this.velocidade = 0;
		this.marcha = 0;
	}
	
	public AutomatizaMarchas() {
	}

	public void acelerar () {
		if(velocidade < 130) {
			velocidade += 5;
		atualizarMarcha();
		}
	}
	
	public void frear() {
		if(velocidade > 0) {
			velocidade -= 5;
		atualizarMarcha();
		}
	}
	
	public void atualizarMarcha() {
		if(velocidade == 0) {
			marcha = 0;
		} else if((velocidade > 0) && (velocidade <= 19)) {
			marcha = 1;
		} else if((velocidade > 19) && (velocidade <= 39)) {
			marcha = 2;
		} else if((velocidade > 39) && (velocidade <= 59)) {
			marcha = 3;
		} else if((velocidade > 59) && (velocidade <= 89)) {
			marcha = 4;
		} else if((velocidade > 89) && (velocidade <= 130)) {
			marcha = 5;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}
