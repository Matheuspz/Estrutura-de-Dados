package Exercicio1Base;

public class Vetor {

    private Integer[] vetor;
    private int tamanho;
    private int numElementos;

    public Vetor(int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    // Insere no final; se cheio, dobra o tamanho do vetor
    public void inserir(int valor) {
        if(numElementos != this.tamanho) {
            vetor[numElementos] = valor;
            numElementos++;
        } else {
            Vetor newVetor = new Vetor(this.tamanho*2);
            for(int i = 0; i < this.tamanho; i++) {
                System.out.println("TESTE");
                newVetor.inserir(this.vetor[i]);
            }
            newVetor.inserir(valor);
            this.vetor = newVetor.vetor;
            this.tamanho = newVetor.tamanho;
            this.numElementos = newVetor.numElementos;
        }
    }

    // Percorre item por item e retorna a posição; -1 se não encontrado
    public int buscar(int valor) { return -1; }

    // Encontra o elemento e realoca os próximos uma posição para trás
    public boolean remover(int valor) {

        return false;
    }

    // Printa elemento por elemento do vetor
    public void exibir() {}

    // Insere na posição indicada, realocando os próximos; se cheio, dobra o tamanho
    public void inserirNaPosicao(int posicao, int valor) {}

    public int getNumElementos() { return numElementos; }

    public int getTamanho() { return tamanho; }
}
