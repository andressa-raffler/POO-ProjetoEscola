package org.example.servico;

import org.example.dominio.Boletim;
import org.example.repositorio.RepositorioBoletins;

public class AtualizarNota {


    public static void executar(Boletim boletimCadastrado, double nota) {
        RepositorioBoletins.getInstance().alterarNotaCadastrada(boletimCadastrado, nota);
        System.out.println("Nota atualizada com sucesso!");
    }
}
