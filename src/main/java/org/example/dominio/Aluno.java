package org.example.dominio;

public class Aluno {
        String matriculaAluno = null;
        String nomeAluno = null;
        String nomeResponsavel = null;
        String emailResponsavel = null;
        int celularResponsavel = 0;

    public Aluno(String matriculaAluno, String nomeAluno,  String nomeResponsavel, String emailResponsavel, int celularResponsavel ) {
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

    public int getCelularResponsavel() {
        return celularResponsavel;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public void setCelularResponsavel(int celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
    }
}
