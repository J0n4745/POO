package exercício03;

public class Aluno {
	
	    private int ra;
	    private String nome;
	    private double[] notas;

	    public Aluno(int ra, String nome, double[] notas) {
	        this.ra = ra;
	        this.nome = nome;
	        this.notas = notas;
	    }

	    public Aluno() {
		}

		public int getRa() {
	        return ra;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double[] getNotas() {
	        return notas;
	    }

	    public double calcularMedia() {
	        double soma = 0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.length;
	    }

	    public String verificarAprovacao() {
	        double media = calcularMedia();
	        if (media >= 6.0) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }

	    @Override
	    public String toString() {
	        return "Aluno{" +
	                "ra=" + ra +
	                ", nome='" + nome + '\'' +
	                '}';
	    }
	}
