package org.example.repositorio;


import org.example.dominio.Aluno;
import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioBoletins {

    private static RepositorioBoletins repositorioBoletins;
    private ArrayList<Boletim> boletinsCadastrados;

    private RepositorioBoletins() {
        boletinsCadastrados = new ArrayList<>();
    }

    public static RepositorioBoletins getInstance() {
        if (repositorioBoletins == null) {
            repositorioBoletins = new RepositorioBoletins();
        }
        return repositorioBoletins;
    }



    public void salvar(Boletim boletim) {
        boletinsCadastrados.add(boletim);
    }


    public void alterarNotaCadastrada(Boletim boletim, double nota) {
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.equals(boletim)) {
                boletimCadastrado.setNota(nota);
            }
        }
    }

    public Boletim ler(String matricula) {
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getAluno().getMatriculaAluno().equals(matricula)) {
                return boletimCadastrado;
            }
        }
        return null;
    }



    public List<Boletim> getBoletimPorAluno(Aluno aluno){
        List<Boletim> boletimPorAluno = new ArrayList<>();
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getAluno().equals(aluno)) {
                boletimPorAluno.add(boletimCadastrado);
            }
        }
        return boletimPorAluno;
    }

    public List<Boletim> getBoletimPorAlunoPorDisciplina(Aluno aluno, Disciplinas disciplina){
        List<Boletim> boletimPorAlunoPorDisciplina = new ArrayList<>();
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getAluno().equals(aluno) && boletimCadastrado.getDisciplina().equals(disciplina)) {
                boletimPorAlunoPorDisciplina.add(boletimCadastrado);
            }
        }
        Collections.sort(boletimPorAlunoPorDisciplina);
        return boletimPorAlunoPorDisciplina;
    }


}
