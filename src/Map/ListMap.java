package Map;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListMap<K, V> {

    private List<Entry<K, V>> l = new ArrayList<>();


    public void put(K key, V value) {

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

    public V get(K key) {
        Entry<K, V> matchingObject = l.stream()
                .filter(x -> x.getKey().equals(key))
                .findAny().orElse(null);

        if (matchingObject == null) {
            return null;
        } else {
            return matchingObject.getValue();
        }
    }

    public void remove(K key) {
        l.removeIf(x -> x.getKey() == key);
    }

    public int size() {
        return l.size();
    }


}
