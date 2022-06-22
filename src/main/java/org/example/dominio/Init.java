package org.example.dominio;

import org.example.repositorio.RepositorioAlunos;
import org.example.repositorio.RepositorioBoletins;


public class Init {
    public static void executar() {

        Aluno aluno1 = new Aluno("matricula1", "andressa", "responsavel1", "emailResp1", 111);
        Aluno aluno2 = new Aluno("matricula2", "beatriz", "responsavel2", "emailResp2", 222);
        Aluno aluno3 = new Aluno("matricula3", "aluno3", "responsavel3", "emailResp3", 333);


        RepositorioAlunos.getInstance().salvar(aluno1);
        RepositorioAlunos.getInstance().salvar(aluno2);
        RepositorioAlunos.getInstance().salvar(aluno3);

        RepositorioBoletins.getInstance().salvar(new Boletim(aluno1, Disciplinas.valueOfCode(0), new double[]{7.1, 8, 9.6, 4}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno1, Disciplinas.valueOfCode(1), new double[]{4, 4, 4, 4}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno1, Disciplinas.valueOfCode(2), new double[]{8, 4.6, 9.2, 10}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno1, Disciplinas.valueOfCode(3), new double[]{7.7, 8.8, 9.9, 4.4}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno1, Disciplinas.valueOfCode(4), new double[]{0, 8, 9, 8}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno2, Disciplinas.valueOfCode(0), new double[]{8, 8, 8, 0}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno2, Disciplinas.valueOfCode(1), new double[]{7, 7, 7, 7}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno2, Disciplinas.valueOfCode(2), new double[]{5, 5, 5, 5}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno2, Disciplinas.valueOfCode(3), new double[]{6, 6, 6, 6}));
        RepositorioBoletins.getInstance().salvar(new Boletim(aluno2, Disciplinas.valueOfCode(4), new double[]{10, 10, 10, 0}));


    }

}
