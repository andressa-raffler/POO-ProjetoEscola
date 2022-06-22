package org.example.servico;

import org.example.dominio.Aluno;
import org.example.dominio.Bimestres;
import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;
import org.example.repositorio.RepositorioBoletins;



public class ImprimirBoletim {

    Aluno aluno;

    public ImprimirBoletim(Aluno aluno) {
        this.aluno = aluno;
        executar();
    }

    private void executar() {

        System.out.println("BOLETIM DO ALUNO: "+aluno.getNomeAluno());
        for(Disciplinas disciplina: Disciplinas.values()) {
        System.out.print(" | Disciplina: "+disciplina);
        Boletim boletimPorAlunoPorDisciplina = RepositorioBoletins.getInstance().getBoletimPorAlunoPorDisciplina(aluno, disciplina);
            if (!(boletimPorAlunoPorDisciplina == null)) {
                double notas[] = boletimPorAlunoPorDisciplina.getNotas();
                for(Bimestres bimestre : Bimestres.values()) {
                    System.out.print(" | Bimestre: "+bimestre.getNumeroBimestre() +" Nota: " +notas[(bimestre.ordinal())]);
            }
            System.out.print("| Media: "+boletimPorAlunoPorDisciplina.getMediaFinal());
        }

//            for (Boletim boletim : RepositorioBoletins.getInstance().getBoletimPorAlunoPorDisciplina(aluno, disciplina)) {
//                System.out.print(" | Média: "+boletim.getMediaFinal());
//            }
        System.out.println();
        }
    }
}
