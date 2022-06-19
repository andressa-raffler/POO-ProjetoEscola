package org.example.servico;


import org.example.dominio.Boletim;
import org.example.repositorio.RepositorioBoletins;

public class GravarBoletim {

    Boletim boletim;
    public GravarBoletim(Boletim boletim) {
        this.boletim = boletim;
    }

    public static void executar(Boletim boletim) {

        RepositorioBoletins.getInstance().salvar(boletim);

    }
}
