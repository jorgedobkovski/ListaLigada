public interface IQueue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean empty();
    int size();
}
