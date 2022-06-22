package org.example.dominio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Boletim  {
    private Aluno aluno;
    private Disciplinas disciplina;
    private int bimestre;
    Bimestres bimestres;
    double[] notas = new double[4];
    private double mediaFinal = 0;

    public Boletim(Aluno aluno, Disciplinas disciplina, int bimestre, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.bimestre = bimestre;
        notas[bimestre-1] = nota;
        mediaFinal = calcularMedia(notas);
    }

    public Boletim (Aluno alunoEntrada, Disciplinas disciplinaEntrada, double[] notasEntrada){
        aluno = alunoEntrada;
        disciplina = disciplinaEntrada;
        Bimestres Bimestres;
        notas = notasEntrada;
        mediaFinal = calcularMedia(notas);
    }




    public Aluno getAluno() {
        return this.aluno;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setNota(double nota, int bimestre) {
        notas[bimestre-1] = nota;
    }

    public double getNota(int bimestre) {
        return notas[bimestre-1];
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boletim boletim = (Boletim) o;
        return Objects.equals(aluno, boletim.aluno) && disciplina == boletim.disciplina;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, disciplina, bimestre);
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public double[] getNotas() {
        return notas;
    }


    private double calcularMedia(double[] notas){
        for (double nota : notas) {
            mediaFinal += nota;
        }
        return mediaFinal/4;
    }
}
