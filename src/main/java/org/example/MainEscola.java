package org.example;


import org.example.dominio.Init;
import org.example.servico.EnviarBoletimPorEmail;
import org.example.servico.EnviarBoletimPorSMS;
import org.example.servico.EnviarBoletimParaImpressora;
import org.example.tela.*;

import java.util.Scanner;

public class MainEscola
{
    public static void main(String[] args) {

        Init.executar();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("----------------------------------------");
            System.out.println("           Escola Raffler               ");
            System.out.println("   1 - Gravar Aluno                     ");
            System.out.println("   2 - Gravar Nota                      ");
            System.out.println("   3 - Enviar Boletim por email         ");
            System.out.println("   4 - Enviar Boletim por SMS           ");
            System.out.println("   5 - Enviar Boletim p/ Impressora     ");
            System.out.println("   6 - Exibir as notas de uma disciplina");
            System.out.println("   0 - Sair                             ");
            System.out.println("----------------------------------------");
            try{
                option = sc.nextInt();
            }
            catch (Exception exception){
                System.out.println("Opçao inválida, tente novamente");
                MainEscola.main(args);

            }

            switch (option) {
                case 1:
                    TelaGravarAluno.executar(sc);
                    break;
                case 2:
                    TelaGravarNotaNoBoletim.executar(sc);
                    break;
                case 3:
                case 4:
                case 5:
                    TelaEnviarBoletim.executar(sc,option);
                    break;
                case 6:
                    TelaExibirNotasPorDisciplina.executar(sc);
                    break;
            }

        } while (option != 0);
    }
}
