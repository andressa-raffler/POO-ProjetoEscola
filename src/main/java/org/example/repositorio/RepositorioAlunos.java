package org.example.repositorio;

import org.example.dominio.Aluno;

import java.util.ArrayList;

public class RepositorioAlunos {

    private static RepositorioAlunos alunosRepositorio;
    private ArrayList<Aluno> alunosCadastrados;

    private RepositorioAlunos() {
        alunosCadastrados = new ArrayList<>();
    }

    public static RepositorioAlunos getInstance() {
        if (alunosRepositorio == null) {
            alunosRepositorio = new RepositorioAlunos();
        }
        return alunosRepositorio;
    }

    public void salvar(Aluno aluno) {
        alunosCadastrados.add(aluno);
    }


    public Aluno ler(String matricula) {
        for (Aluno alunoCadastrado : alunosCadastrados) {
            if (alunoCadastrado.getMatriculaAluno().equals(matricula)) {
                return alunoCadastrado;
            }
        }
        return null;
    }
}


