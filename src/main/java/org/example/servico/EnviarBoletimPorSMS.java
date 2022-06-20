package org.example.servico;

import org.example.dominio.Aluno;

import java.util.Scanner;

public class EnviarBoletimPorSMS {

    public static void executar(Scanner sc, Aluno aluno) {

        System.out.println("----------------------------------------");
        System.out.println("            BOLETIM VIA SMS             ");
        System.out.println("----------------------------------------");
        System.out.println();


        System.out.println("O boletim do aluno "+aluno.getNomeAluno()+" foi enviado com sucesso " +
                "para o celular "+aluno.getCelularResponsavel()+" do responsável "+aluno.getNomeResponsavel());

    }
}

