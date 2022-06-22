package org.example.dominio;

import java.util.ArrayList;
import java.util.Arrays;

public enum Bimestres {

    PRIMEIRO(1),
    SEGUNDO(2),
    TERCEIRO(3),
    QUARTO(4);

    private final int numeroBimestre;

    Bimestres(int numeroBimestre) {
        this.numeroBimestre = numeroBimestre;
    }

    public static boolean validarBimestre(int opcao) throws Exception {
        for (Bimestres bimestre : Bimestres.values()) {
            if (bimestre.numeroBimestre == opcao) {
                return true;
            }
        }
        throw new Exception();
    }

    public int getNumeroBimestre() {
        return numeroBimestre;
    }

    public ArrayList<Bimestres> getBimestres(){
        ArrayList<Bimestres> bimestres;
        bimestres = new ArrayList<Bimestres>();
        bimestres.addAll(Arrays.asList(Bimestres.values()));
        return bimestres;
    }


}

