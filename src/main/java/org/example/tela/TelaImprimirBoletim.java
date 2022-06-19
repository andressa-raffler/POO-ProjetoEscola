package org.example.tela;

import org.example.dominio.Aluno;
import org.example.servico.ImprimirBoletim;
import org.example.servico.ProcurarAluno;

import java.util.Scanner;

public class TelaImprimirBoletim {

    public static void executar(Scanner sc) {

        Aluno aluno = ProcurarAluno.executar(sc);
        ImprimirBoletim imprimirBoletim = new ImprimirBoletim(aluno);


    }
}

