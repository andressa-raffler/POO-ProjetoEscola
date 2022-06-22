package org.example.dominio;

public enum Disciplinas {

    PORTUGUES,
    CIENCIAS,
    MATEMATICA,
    HISTORIA,
    GEOGRAFIA;


    public static void imprimirListaDisciplinas() {
        System.out.println("Lista de disciplinas: ");
        for(Disciplinas disciplina : Disciplinas.values()){
            System.out.println(disciplina.ordinal()+" - "+disciplina);
        }
    }


        public static Disciplinas valueOfCode(int opcao) {
        for(Disciplinas disciplina : Disciplinas.values()){
            if(disciplina.ordinal() == opcao){
                return disciplina;
            }
        }
        return null;

    }





//    GR("Graduação", 4, 1),
//    MS("Mestrado", 6, 2),
//    DT("Doutorado", 9, 3);
//
//    private final String descricao;
//    private final int maxLivros;
//    private final int code;
//
//    TipoAluno(String descricao, int maxLivros, int code) {
//        this.descricao = descricao;
//        this.maxLivros = maxLivros;
//        this.code = code;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public static TipoAluno valueOfCode(int opcao) {
//        for(TipoAluno tipoAluno : TipoAluno.values()){
//            if(tipoAluno.getCode() == opcao){
//                return tipoAluno;
//            }
//        }
//        return null;
//    }
//
//    public int getMaxLivros() {
//        return maxLivros;
//    }
}
