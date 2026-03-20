public class Vetor {

    private final int[] vetor;
    private final int tamanho;
    private int numElementos = 0;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        vetor = new int[tamanho];
    }

    public boolean inserir(int valor) {
        if(numElementos == tamanho){
            return false;
        }
        vetor[numElementos] = valor;
        numElementos++;
        return true;
    }

    public boolean removerPosicao(int posicao) {
        if(vetor[posicao] != 0) {
            for(int i = posicao; i < numElementos-1; i++) {
                vetor[i] = vetor[i+1];
            }
            vetor[numElementos-1] = 0;
            numElementos--;
            return true;
        }
        return false;
    }
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


    public int buscar(int valor) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int buscaBinaria(int valor) {
        int inicio = 0;
        int fim = numElementos;

        while(inicio < fim) {
            int chute = (fim + inicio) / 2;

            if(vetor[chute] == valor) {
                return chute;
            }

            if(valor > vetor[chute]) {
                fim = chute + 1;
            } else {
                inicio = chute - 1;
            }
        }
        return -1;
    }

    public int getNumElementos() {
        return numElementos;
    }
}
