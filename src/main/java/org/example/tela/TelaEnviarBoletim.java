package org.example.tela;

import org.example.dominio.Aluno;
import org.example.servico.*;

import java.util.Scanner;

public class TelaEnviarBoletim {


    public static void  executar(Scanner sc, int option){

        Aluno aluno = ProcurarAluno.executar(sc);

        switch (option){
            case 3:
                EnviarBoletimPorEmail.executar(sc, aluno);
                break;
            case 4:
                EnviarBoletimPorSMS.executar(sc, aluno);
                break;
            case 5:
                EnviarBoletimParaImpressora.executar(sc, aluno);
                break;

        }

    }
}
