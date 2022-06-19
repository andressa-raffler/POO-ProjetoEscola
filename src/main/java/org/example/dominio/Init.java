package org.example.dominio;

import org.example.repositorio.RepositorioAlunos;
import org.example.repositorio.RepositorioBoletins;

public class Init {
    public static void executar(){
        Aluno aluno1 = new Aluno("matricula1","aluno1","responsavel1","emailResp1",111 );
        Aluno aluno2 = new Aluno("matricula2","aluno2","responsavel2","emailResp2",222 );
        Aluno aluno3 = new Aluno("matricula3","aluno3","responsavel3","emailResp3",333 );


        RepositorioAlunos.getInstance().salvar(aluno1);
        RepositorioAlunos.getInstance().salvar(aluno2);
        RepositorioAlunos.getInstance().salvar(aluno3);

        Boletim boletim1 = new Boletim(aluno1, Disciplinas.valueOfCode(0),1,10 );
        Boletim boletim2 = new Boletim(aluno1, Disciplinas.valueOfCode(1),2,9 );
        Boletim boletim3 = new Boletim(aluno1, Disciplinas.valueOfCode(2),1,7 );
        Boletim boletim4 = new Boletim(aluno1, Disciplinas.valueOfCode(2),2,3 );

        RepositorioBoletins.getInstance().salvar(boletim1);
        RepositorioBoletins.getInstance().salvar(boletim2);
        RepositorioBoletins.getInstance().salvar(boletim4);
        RepositorioBoletins.getInstance().salvar(boletim3);






    }

}
