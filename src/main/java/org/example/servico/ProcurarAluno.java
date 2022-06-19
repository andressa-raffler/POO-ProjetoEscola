package org.example.servico;

import org.example.dominio.Aluno;
import org.example.repositorio.RepositorioAlunos;

import java.util.Scanner;

public class ProcurarAluno {
    public static Aluno executar(Scanner scanner) {
        Aluno aluno = null;

        try {
            System.out.println("Insira a matrícula do aluno: ");
            scanner.nextLine();
            String matricula = scanner.next().toLowerCase();
            scanner.nextLine();
            aluno = RepositorioAlunos.getInstance().ler(matricula.toLowerCase());
            if (aluno == null) {
                throw new Exception();
            }
        } catch (Exception exception) {
            System.out.println("Matrícula inválida.");
            ProcurarAluno.executar(scanner);
        }
        System.out.println();
        return aluno;
    }
}
