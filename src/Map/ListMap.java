package Map;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListMap<K, V> {

    private List<Entry<K, V>> l = new ArrayList<>();


    /**
     * Add or overwrite a new key value pair
     *
     * @param key
     * @param value
     */
    public void put(K key, V value) {

        if (key == null) { // null check
            throw new NullPointerException();
        }

        Entry<K, V> en = new Entry<>(key, value);

        Entry<K, V> matchingObject = l.stream()
                .filter(x -> x.getKey().equals(key))
                .findAny().orElse(null);

        if (matchingObject == null) {
            l.add(en);
        } else {
            matchingObject.setValue(value);
        }
    }

    /**
     * retrieve corresponding value for given key
     *
     * @param key
     * @return value
     */
    public V get(K key) {

        if (key == null) { // null check
            throw new NullPointerException();
        }

        Entry<K, V> matchingObject = l.stream()
                .filter(x -> x.getKey().equals(key))
                .findAny().orElse(null);

        if (matchingObject == null) {
            return null;
        } else {
            return matchingObject.getValue();
        }
    }

    /**
     * remove given key value pair from list is present
     *
     * @param key
     */
    public void remove(K key) {

        if (key == null) { // null check
            throw new NullPointerException();
        }

        l.removeIf(x -> x.getKey() == key);
    }

    /**
     * list size retrieval
     *
     * @return length of list
     */
    public int size() {
        return l.size();
    }


}
