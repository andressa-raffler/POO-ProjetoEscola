package org.example.tela;

import org.example.dominio.Aluno;
import org.example.servico.ProcurarAluno;

import java.util.Scanner;

public class TelaEnviarBoletimPorSMS {

    public static void executar(Scanner sc) {

        System.out.println("----------------------------------------");
        System.out.println("            BOLETIM VIA SMS             ");
        System.out.println("----------------------------------------");
        System.out.println();
        Aluno aluno = ProcurarAluno.executar(sc);

        System.out.println("O boletim do aluno "+aluno.getNomeAluno()+" foi enviado com sucesso " +
                "para o celular "+aluno.getCelularResponsavel()+" do responsável "+aluno.getNomeResponsavel());

    }
}

