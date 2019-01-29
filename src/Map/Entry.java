package Map;

public class Entry<K, V> {

    private K key;
    private V value;

    // Constructor
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Setter
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Key: %s\tValue: %s", this.key, this.value);
    }
}
