package Exercicio1Base;

public class ListaEncadeada {

    Node inicio;
    Node fim;

    public ListaEncadeada() {

    }

    public void inserirInicio(int valor) {
        Node novoNode = new Node(valor);
        if(fim == null) {
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

    public void inserirApos(int valorProcurado, int valorInserido) {}

    public Node buscar(int valor) {

        return null;
    }

    public void removerInicio() {}

    public void removerFim() {}

    public void remover(int valor) {}

    public boolean estaVazia() { return true; }

    public int tamanho() { return 0; }
}
