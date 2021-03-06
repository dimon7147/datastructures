package structures.tables.chain;

public class Node<K,V> {
    private final K key;
    private V value;

    private Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + "|" + value + "]";
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
}