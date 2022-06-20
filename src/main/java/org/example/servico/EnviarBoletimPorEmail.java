package org.example.servico;

import org.example.dominio.Aluno;
import java.util.Scanner;

public class EnviarBoletimPorEmail {

        public static void executar(Scanner sc, Aluno aluno) {

            System.out.println("----------------------------------------");
            System.out.println("            BOLETIM VIA E-MAIL          ");
            System.out.println("----------------------------------------");
            System.out.println();


            System.out.println("O boletim do aluno "+aluno.getNomeAluno()+" foi enviado com sucesso " +
                    "para o e-mail "+aluno.getEmailResponsavel()+" do responsável "+aluno.getNomeResponsavel());

        }

}
