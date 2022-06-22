package org.example.servico;

import org.example.dominio.Boletim;
import org.example.repositorio.RepositorioBoletins;

public class AtualizarNota {


    public static void executar(Boletim boletimCadastrado, double nota, int bimestre) {
        RepositorioBoletins.getInstance().alterarNotaCadastrada(boletimCadastrado, nota, bimestre);
        System.out.println("Nota atualizada com sucesso!");
    }
}
