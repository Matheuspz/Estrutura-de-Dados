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
            dobrarTamanhoVetor(valor, 0, false);
        }
    }

    // Insere na posição indicada, realocando os próximos; se cheio, dobra o tamanho
    public void inserirNaPosicao(int valor, int posicao) {
        if(numElementos != this.tamanho) {
            for(int i = numElementos; i > posicao; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor[posicao] = valor;
            numElementos++;
        } else {
            dobrarTamanhoVetor(valor, posicao,true);
        }
    }

    private void dobrarTamanhoVetor(int valor, int posicao, boolean isPosicao) {
        Vetor newVetor = new Vetor(this.tamanho*2);
        for(int i = 0; i < this.tamanho; i++) {
            newVetor.inserir(this.vetor[i]);
        }
        if(isPosicao) {
            newVetor.inserirNaPosicao(valor, posicao);
        } else {
            newVetor.inserir(valor);
        }
        this.vetor = newVetor.vetor;
        this.tamanho = newVetor.tamanho;
        this.numElementos = newVetor.numElementos;
    }

    // Percorre item por item e retorna a posição; -1 se não encontrado
    public int buscar(int valor) {
        for(int i = 0; i < this.numElementos; i++) {
            if(vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Encontra o elemento e realoca os próximos uma posição para trás
    public boolean remover(int valor) {
        int posicao = buscar(valor);
        if (posicao != -1) {
            for(int i = posicao; i < numElementos-1; i++) {
                vetor[i] = vetor[i+1];
            }
            vetor[numElementos - 1] = 0;
            numElementos--;
            return true;
        }
        return false;
    }

    // Printa elemento por elemento do vetor
    public void exibir() {
        for(int i = 0; i < this.tamanho; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }
        System.out.println(" ");
    }

    public int getNumElementos() { return numElementos; }
    public int getTamanho() { return tamanho; }
}
