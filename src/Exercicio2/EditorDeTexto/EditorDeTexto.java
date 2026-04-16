package Exercicio2.EditorDeTexto;

public class EditorDeTexto {

    PilhaString desfazer;
    PilhaString refazer;
    String texto;

    public EditorDeTexto(PilhaString pilhaDesfazer, PilhaString pilhaRefazer) {
        this.desfazer = pilhaDesfazer;
        this.refazer = pilhaRefazer;
    }

    public void inserirTexto(String valor) {
        desfazer.inserir(texto);
        texto = valor;
        refazer.remover();
    }

    public void desfazerTexto() {
        refazer.inserir(texto);
        texto = desfazer.getTopo();
        desfazer.remover();
    }
    public void refazerTexto() {
        desfazer.inserir(texto);
        texto = refazer.getTopo();
        refazer.remover();
    }

    public void printTexto() {
        System.out.println(texto);
    }

}
