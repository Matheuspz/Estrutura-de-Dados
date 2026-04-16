package Exercicio2.EditorDeTexto;

public class Desfazer {

    private String[] vetor;
    private int tamanho;
    private int numElementos;

    public Desfazer(int tamanho) {
        this.vetor = new String[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    public void inserir(String valor) {
        if(!isFull()) {
            vetor[numElementos] = valor;
            numElementos++;
        } else {
            dobrarTamanhoPilha(valor);
        }
    }

    public void remover() {
        if(!isEmpty()) {
            vetor[numElementos-1] = null;
            numElementos--;
        }
    }

    private void dobrarTamanhoPilha(String valor) {
        Desfazer newPilha = new Desfazer(this.tamanho*2);
        for(int i = 0; i < this.tamanho; i++) {
            newPilha.inserir(this.vetor[i]);
        }
        newPilha.inserir(valor);
        this.vetor = newPilha.vetor;
        this.tamanho = newPilha.tamanho;
        this.numElementos = newPilha.numElementos;
    }

    public boolean isEmpty() {
        return numElementos == 0;
    }
    public boolean isFull() {
        return numElementos == tamanho;
    }

}
