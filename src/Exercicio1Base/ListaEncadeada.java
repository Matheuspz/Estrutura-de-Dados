package Exercicio1Base;

public class ListaEncadeada {

    Node inicio;
    Node fim;

    public ListaEncadeada() {

    }

    public void inserirInicio(int valor) {
        Node novoNode = new Node(valor);
        if(estaVazia()) {
            novoNode.proximo = inicio;
            inicio = novoNode;
            fim = novoNode;
        } else {
            novoNode.proximo = inicio;
            inicio = novoNode;
            novoNode.proximo.anterior = novoNode;
        }
    }

    public void inserirFim(int valor) {
        Node novoNode = new Node(valor);

        novoNode.anterior = fim;
        novoNode.anterior.proximo = novoNode;
        fim = novoNode;
    }

    public void inserirApos(int valorProcurado, int valorInserido) {
        Node nodeLocalizado = buscar(valorProcurado);
        Node novoNode = new Node(valorInserido);

        novoNode.proximo = nodeLocalizado.proximo;
        novoNode.anterior = nodeLocalizado;
        nodeLocalizado.proximo.anterior = novoNode;
        nodeLocalizado.proximo = novoNode;
    }

    public void removerInicio() {
        inicio.proximo.anterior = null;
        inicio = inicio.proximo;
    }

    public void removerFim() {
        fim.anterior.proximo = null;
        fim = fim.anterior;
    }

    public void remover(int valor) {
        Node nodeLocalizado = buscar(valor);
        if(nodeLocalizado.anterior == null){
            removerInicio();
        }
        else if(nodeLocalizado.proximo == null){
            removerFim();
        } else {
            nodeLocalizado.anterior.proximo = nodeLocalizado.proximo;
            nodeLocalizado.proximo.anterior = nodeLocalizado.anterior;
        }
    }

    public boolean estaVazia() {
        return inicio == null && fim == null;
    }

    public Node buscar(int valor) {
        Node nodePonteiro = this.inicio;
        while(nodePonteiro.proximo != null) {
            if(nodePonteiro.valor == valor) {
                return nodePonteiro;
            }
            nodePonteiro = nodePonteiro.proximo;
        }
        return null;
    }

    public int tamanho() {
        if (!estaVazia()) {
            int contador = 1;
            Node nodePonteiro = this.inicio;
            while (nodePonteiro.proximo != null){
                nodePonteiro = nodePonteiro.proximo;
                contador++;
            }
            return contador;
        }
        return 0;
    }
}
