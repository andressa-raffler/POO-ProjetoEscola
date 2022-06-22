package org.example.servico;

import org.example.dominio.Boletim;
import org.example.dominio.Disciplinas;
import org.example.repositorio.RepositorioBoletins;


import java.util.List;

public class ExibirNotasPorDisciplina {


    public static List<Boletim> executar(Disciplinas disciplina){
        return RepositorioBoletins.getInstance().getBoletimPorDisciplina(disciplina);
    }
}
