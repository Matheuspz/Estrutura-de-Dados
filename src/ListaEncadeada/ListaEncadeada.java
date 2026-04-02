package ListaEncadeada;

public class ListaEncadeada {
    Node inicio;

    public ListaEncadeada() {}

    public void inseirNoInicio(int valor){
        Node novoNode = new Node(valor);
        novoNode.proximo = inicio;
        inicio = novoNode;
    }
    public void removerInicio(){
        Node novoInicio = inicio;
        this.inicio = novoInicio.proximo;
    }

}
