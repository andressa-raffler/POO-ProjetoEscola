package org.example.servico;

import org.example.dominio.Aluno;

import java.util.Scanner;

public class EnviarBoletimParaImpressora{

    public static void executar(Scanner sc, Aluno aluno) {
        System.out.println("----------------------------------------");
        System.out.println("            BOLETIM IMPRESSO            ");
        System.out.println("----------------------------------------");
        System.out.println();
        ImprimirBoletim imprimirBoletim = new ImprimirBoletim(aluno);


    }
}

