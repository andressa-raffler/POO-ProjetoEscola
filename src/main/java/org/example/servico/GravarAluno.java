package org.example.servico;

import org.example.dominio.Aluno;
import org.example.repositorio.RepositorioAlunos;

public class GravarAluno {
    public static void executar(Aluno aluno) {

        RepositorioAlunos.getInstance().salvar(aluno);

    }
}
