package org.example.tela;

import org.example.dominio.Aluno;
import org.example.servico.ProcurarAluno;

import java.util.Scanner;

public class TelaEnviarBoletimPorEmail {
    public static void executar(Scanner sc) {

        System.out.println("----------------------------------------");
        System.out.println("            BOLETIM VIA E-MAIL          ");
        System.out.println("----------------------------------------");
        System.out.println();
        Aluno aluno = ProcurarAluno.executar(sc);

        System.out.println("O boletim do aluno "+aluno.getNomeAluno()+" foi enviado com sucesso " +
                "para o e-mail "+aluno.getEmailResponsavel()+" do responsável "+aluno.getNomeResponsavel());

    }

}
