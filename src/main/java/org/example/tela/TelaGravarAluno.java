package org.example.tela;

import org.example.dominio.Aluno;
import org.example.servico.GravarAluno;

import java.util.Scanner;

public class TelaGravarAluno {
    public static void executar(Scanner sc) {

        try {
            System.out.println("----------------------------------------");
            System.out.println("            CADASTRAR NOVO ALUNO        ");
            System.out.println("----------------------------------------");
            System.out.println("");
            sc.nextLine();
            System.out.println("Insira a matrícula do aluno: ");
            String matricula = sc.next().toLowerCase();
            System.out.println("Insira o nome do aluno: ");
            String nomeAluno = sc.next();
            System.out.println("Insira o nome do reponsável: ");
            String nomeResponsavel = sc.next();
            System.out.println("Insira o e-mail do reponsável: ");
            String emailResponsavel = sc.next();
            System.out.println("Insira o celular do reponsável: ");
            int celularResponsavel = sc.nextInt();
            sc.nextLine();
            Aluno aluno = new Aluno(matricula, nomeAluno, nomeResponsavel, emailResponsavel, celularResponsavel);
            GravarAluno.executar(aluno);

        }catch (Exception exception){
            System.out.println("Dado inválido, tente novamente");
            sc.nextLine();
            TelaGravarAluno.executar(sc);
        }

    }
}
