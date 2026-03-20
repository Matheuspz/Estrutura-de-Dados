public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.inserir(7);
        vetor.inserir(8);
        vetor.inserir(9);
        vetor.inserir(10);
        vetor.inserir(11);

//        vetor.remover(1);
        System.out.println(vetor.buscar(9));

    }
}
