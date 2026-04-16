package Exercicio2.EditorDeTexto;

public class EditorDeTexto {

    Desfazer pilhaDesfazer;
    Refazer pilhaRefazer;
    String texto;

    public EditorDeTexto(Desfazer pilhaDesfazer, Refazer pilhaRefazer) {
        this.pilhaDesfazer = pilhaDesfazer;
        this.pilhaRefazer = pilhaRefazer;
    }

}
