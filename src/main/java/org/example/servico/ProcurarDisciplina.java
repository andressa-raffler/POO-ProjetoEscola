package org.example.servico;


import org.example.dominio.Disciplinas;


import java.util.Scanner;

public class ProcurarDisciplina {


    public static Disciplinas executar(Scanner scanner) {
        Disciplinas disciplina = null;
        try {
            System.out.println("Insira o número correspondente a disciplina desejada");
            Disciplinas.imprimirListaDisciplinas();
            int código = scanner.nextInt();
            disciplina = Disciplinas.valueOfCode(código);
            if (disciplina == null) {
                System.out.println("Disciplina inválida");
                return null;
            }
        } catch (Exception exception) {
            System.out.println("Valor digitado nao corresponde a nenhuma disciplina");
            return null;
        }
        return disciplina;
    }
}
