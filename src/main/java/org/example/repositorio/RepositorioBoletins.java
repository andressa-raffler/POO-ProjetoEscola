package org.example.repositorio;


import org.example.dominio.Aluno;
import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;
import java.util.ArrayList;
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



    public ArrayList<Boletim> salvar(Boletim boletim) {
        if(boletinsCadastrados.isEmpty()){
            boletinsCadastrados.add(boletim);
        } else {
            for (Boletim boletimCadastrado : boletinsCadastrados) {
                if (boletimCadastrado.equals(boletim)) {
                    boletimCadastrado.setNota(boletim.getNota(boletim.getBimestre()), boletim.getBimestre());
                    return boletinsCadastrados;
                } else {
                    boletinsCadastrados.add(boletim);
                    return boletinsCadastrados;
                }
            }
        }
        return boletinsCadastrados;
    }



    public void alterarNotaCadastrada(Boletim boletim, double nota, int bimestre) {
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.equals(boletim)) {
                boletimCadastrado.setNota(nota, bimestre);
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

    public Boletim getBoletimPorAlunoPorDisciplina(Aluno aluno, Disciplinas disciplina) {
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getAluno().equals(aluno) && boletimCadastrado.getDisciplina().equals(disciplina)) {
                return boletimCadastrado;
            }
        } return null;
    }

    public List<Boletim> getBoletimPorDisciplina(Disciplinas disciplina) {
             List<Boletim> listaNotasPorDisciplina = new ArrayList<>();
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getDisciplina().name().equalsIgnoreCase(disciplina.name())) {
                listaNotasPorDisciplina.add(boletimCadastrado);

            }
            listaNotasPorDisciplina.sort((b1, b2) -> b1.getAluno().getNomeAluno().compareTo(b2.getAluno().getNomeAluno()));
        } return listaNotasPorDisciplina;
    }



}
