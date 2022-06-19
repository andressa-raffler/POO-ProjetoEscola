package org.example.dominio;

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
}

