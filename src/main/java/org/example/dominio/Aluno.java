package org.example.dominio;

public class Aluno {
        String matriculaAluno = null;
        String nomeAluno = null;
        String nomeResponsavel = null;
        String emailResponsavel = null;
        long celularResponsavel = 0;

    public Aluno(String matriculaAluno, String nomeAluno,  String nomeResponsavel, String emailResponsavel, long celularResponsavel ) {
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.emailResponsavel = emailResponsavel;
        this.celularResponsavel = celularResponsavel;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public long getCelularResponsavel() {
        return celularResponsavel;
    }

}
