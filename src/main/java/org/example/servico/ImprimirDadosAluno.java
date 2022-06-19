package org.example.servico;

import org.example.dominio.Aluno;
import org.example.repositorio.RepositorioAlunos;

import java.util.Scanner;

public class ImprimirDadosAluno {

    private static RepositorioAlunos alunosRepositorio;
    public static void executar(Scanner sc) {
        Aluno aluno = ProcurarAluno.executar(sc);
        if(aluno != null) {
            //VERIFICAR PARA IMPLEMENTAR CONSULTA AO REPOSITÓRIO
            System.out.println(aluno.getMatriculaAluno());
            System.out.println(aluno.getNomeAluno());
            System.out.println(aluno.getNomeResponsavel());
        }

    }
}
