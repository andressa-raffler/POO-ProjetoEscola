package org.example.tela;

import org.example.dominio.Aluno;
import org.example.repositorio.RepositorioAlunos;
import org.example.servico.GravarAluno;


import java.util.Scanner;

public class TelaGravarAluno {
    public static void executar(Scanner sc) {
        Aluno aluno = null;
        try {
            System.out.println("----------------------------------------");
            System.out.println("            CADASTRAR NOVO ALUNO        ");
            System.out.println("----------------------------------------");
            System.out.println("");
            sc.nextLine();
            System.out.println("Insira a matrícula do aluno: ");
            String matricula = sc.next().toLowerCase();
            if((RepositorioAlunos.getInstance().ler(matricula.toLowerCase())) == null) {
                System.out.println("Insira o nome do aluno: ");
                String nomeAluno = sc.next();
                System.out.println("Insira o nome do reponsável: ");
                String nomeResponsavel = sc.next();
                System.out.println("Insira o e-mail do reponsável: ");
                String emailResponsavel = sc.next();
                System.out.println("Insira o celular do reponsável: ");
                long celularResponsavel = sc.nextLong();
                sc.nextLine();
                aluno = new Aluno(matricula, nomeAluno, nomeResponsavel, emailResponsavel, celularResponsavel);
                GravarAluno.executar(aluno);
            }else{
                System.out.println("Aluno já cadastrado. Para alterar as informaçoes entre em contato com a diretoria");
            }

        }catch (Exception exception){
            System.out.println("Dado inválido, tente novamente");
            sc.nextLine();
            TelaGravarAluno.executar(sc);
        }

    }
}
