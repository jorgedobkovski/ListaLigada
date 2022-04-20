public class Queue<T> implements IQueue<T> {
    private ListaLigada<T> lista;

    public Queue() {
        lista = new ListaLigada<T>();
    }

    // incluir um elemento no final da fila
    public void enqueue(T item) {
        lista.adicionaFim(item);
    }

    // retirar o último elemento da fila
    public T dequeue() {
        if (!empty()) {
            var no = lista.getUltimo();
            var dado = no.getDado();
            lista.excluiComeco();
            return dado;
        }
        return null;
    }

    // retorna o proximo elemento a ser retirado da fila
    // sem efetivaente retirar
    public T peek() {
        if (!empty()) {
            var no = lista.getPrimeiro();
            var dado = no.getDado();
            return dado;
        }
        return null;
    }

    // verifica se a fila está vazia
    public boolean empty() {
        return lista.getTamanho() == 0;
    }

    // retorna o tamanho da fila
    public int size() {
        return lista.getTamanho();
    }

    // retorna a representação da fila em texto
    public String toString() {
        return lista.toString();
    }
}
