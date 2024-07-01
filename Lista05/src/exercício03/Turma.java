package exercício03;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Aluno> alunos;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<Aluno>();
        inicializarAlunos();
    }

    private void inicializarAlunos() {
        alunos.add(new Aluno(12345, "Ayrton", new double[]{9.8, 10.0, 9.8, 10.0}));
        alunos.add(new Aluno(23456, "Rubens", new double[]{5.5, 6.0, 6.0, 5.5}));
        alunos.add(new Aluno(34567, "Nelson", new double[]{8.0, 7.0, 7.5, 8.5}));
        alunos.add(new Aluno(45678, "Emerson", new double[]{4.5, 5.0, 5.5, 4.0}));
        alunos.add(new Aluno(56789, "Gabriel", new double[]{6.0, 6.5, 7.0, 6.5}));
    }

    public void calcularMediaAlunos() {
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            String situacao = aluno.verificarAprovacao();
            System.out.println("Aluno: " + aluno.getNome() + " - Média: " + media + " - Situação: " + situacao);
        }
    }

    public void calcularMediaTurma() {
        double somaMedias = 0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        double mediaTurma = somaMedias / alunos.size();
        System.out.println("Média da Turma \"" + nomeTurma + "\": " + mediaTurma);
    }
}
