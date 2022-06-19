package org.example.dominio;

import java.util.Objects;

public class Boletim implements Comparable{
    private Aluno aluno;
    private Disciplinas disciplina;
    private int bimestre;
    private double nota;

    public Boletim(Aluno aluno, Disciplinas disciplina, int bimestre, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.bimestre = bimestre;
        this.nota = nota;

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

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  " | Bimestre: "+bimestre  +" Nota: " + nota ;
    }

    @Override
    public int compareTo(Object o) {
        Boletim boletim = (Boletim) o;
        if(this.bimestre > boletim.getBimestre()) {
            return 1;
        }
        if(this.bimestre < boletim.getBimestre()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boletim boletim = (Boletim) o;
        return bimestre == boletim.bimestre && Objects.equals(aluno, boletim.aluno) && disciplina == boletim.disciplina;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, disciplina, bimestre);
    }
}
