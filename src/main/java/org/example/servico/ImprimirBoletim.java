package org.example.servico;

import org.example.dominio.Aluno;
import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;
import org.example.repositorio.RepositorioBoletins;

import java.util.Collections;

public class ImprimirBoletim {

    Aluno aluno;

    public ImprimirBoletim(Aluno aluno) {
        this.aluno = aluno;
        executar();
    }

    private void executar() {

        System.out.println("BOLETIM DO ALUNO: "+aluno.getNomeAluno());
        for(Disciplinas disciplina: Disciplinas.values()) {
        System.out.print(" | Disciplina: "+disciplina);
            for (Boletim boletim : RepositorioBoletins.getInstance().getBoletimPorAlunoPorDisciplina(aluno, disciplina)) {
                System.out.print(boletim.toString());
            }
        System.out.println();
        }
    }
}