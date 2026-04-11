import Exercicio1Base.ListaEncadeada;
import Exercicio1Base.Vetor;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirInicio(3);

        lista.inserirInicio(9);

        lista.inserirFim(10);

        lista.buscar(3);

        lista.buscar(86);

        lista.inserirApos(3,86);

        System.out.println(lista.tamanho());
    }
}
