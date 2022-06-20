package org.example.tela;

import org.example.dominio.*;
import org.example.servico.*;

import java.util.Scanner;

public class TelaGravarNotaNoBoletim {
    public static void executar(Scanner sc) {
    String loop = "";
            try {
                System.out.println("----------------------------------------");
                System.out.println("            CADASTRAR NOTAS             ");
                System.out.println("----------------------------------------");
                System.out.println();
                Aluno aluno = ProcurarAluno.executar(sc);

                do {
                    System.out.println("Para sair digite FIM, para cadastrar mais notas presse C");
                    loop = sc.next();
                    if (!loop.equalsIgnoreCase("FIM")) {
                        Disciplinas disciplina = ProcurarDisciplina.executar(sc);
                        System.out.println("Insira o número do bimestre correspondente, 1, 2, 3 ou 4 ");
                        int bimestre = sc.nextInt();
                        sc.nextLine();
                        Bimestres.validarBimestre(bimestre);
                        System.out.println("Insira a nota do aluno: ");
                        double doubleNota = sc.nextDouble();
                        sc.nextLine();
                        Boletim boletim = new Boletim(aluno, disciplina, bimestre, doubleNota);
                        VerificarSeNotaJaFoiLancada notaJaLancada = new VerificarSeNotaJaFoiLancada(aluno, boletim);
                        if (!(notaJaLancada.executar(sc, doubleNota))) {
                            GravarBoletim.executar(boletim);
                            System.out.println("Nota cadastrada com sucesso");
                        }
                    }
                }while(!loop.equalsIgnoreCase("FIM"));

            }catch (Exception exception){
                System.out.println("Tente novamente");
                TelaGravarNotaNoBoletim.executar(sc);
            }
        }
    }

