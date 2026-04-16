package Exercicio2.EditorDeTexto;

public class MainEditorTexto {
    public static void main(String[] args) {
        PilhaString desfazer = new PilhaString(5);
        PilhaString refazer = new PilhaString(5);
        EditorDeTexto texto = new EditorDeTexto(desfazer, refazer);

        texto.inserirTexto("Abobora");
        texto.printTexto();
        texto.inserirTexto("Banana");
        texto.printTexto();
        texto.desfazerTexto();
        texto.printTexto();
        texto.refazerTexto();
        texto.printTexto();

    }
}
