package org.example.tela;

import org.example.dominio.Aluno;
import org.example.dominio.Bimestres;
import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;
import org.example.repositorio.RepositorioAlunos;
import org.example.repositorio.RepositorioBoletins;
import org.example.servico.ExibirNotasPorDisciplina;
import org.example.servico.ProcurarDisciplina;

import java.util.List;
import java.util.Scanner;

public class TelaExibirNotasPorDisciplina {
    public static void executar(Scanner sc) {
        try {
            Disciplinas disciplina = ProcurarDisciplina.executar(sc);
            List<Boletim> listaBoletinsPorDisciplina = ExibirNotasPorDisciplina.executar(disciplina);
            double[] notas;
            System.out.println("LISTA DE NOTAS DA DISCIPLINA: "+disciplina.name());
            for(Boletim boletim : listaBoletinsPorDisciplina ){
                notas = boletim.getNotas();
                System.out.print("| Aluno: "+boletim.getAluno().getNomeAluno());
                for(Bimestres bimestre : Bimestres.values()) {
                    System.out.print(" | Bimestre: "+bimestre.getNumeroBimestre() +" Nota: " +notas[(bimestre.ordinal())]);
                }
                System.out.print("| Media: "+boletim.getMediaFinal());
                System.out.println();
            }

//            System.out.print(" | Disciplina: "+disciplina);
//            Boletim boletimPorAlunoPorDisciplina = RepositorioBoletins.getInstance().getBoletimPorAlunoPorDisciplina(aluno, disciplina);
//            if (!(boletimPorAlunoPorDisciplina == null)) {
//                double notas[] = boletimPorAlunoPorDisciplina.getNotas();
//                for(Bimestres bimestre : Bimestres.values()) {
//                    System.out.print(" | Bimestre: "+bimestre.getNumeroBimestre() +" Nota: " +notas[(bimestre.ordinal())]);
//                }
//                System.out.print(" Media: "+boletimPorAlunoPorDisciplina.getMediaFinal());
//            }


        }catch (Exception exception){
            executar(sc);
        }

    }
}
