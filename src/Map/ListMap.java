package Map;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListMap<K, V> {

    private List<Entry<K, V>> l = new ArrayList<>();

    public void put(K key, V value) {
        Entry<K, V> en = new Entry<>(key, value);

        boolean t = l.contains(en);

        if (l.contains(en)) {
            l.stream()
                    .filter((Entry e) -> e.getKey() == key)
                    .limit(1)
                    .collect(Collectors.toList()).get(0).setValue(value);
        } else {
            l.add(new Entry<>(key, value));
        }
    }

    public V get(K key) {
        if (l.contains(key)) {
            return l.stream()
                    .filter((Entry e) -> e.getKey() == key)
                    .limit(1)
                    .collect(Collectors.toList()).get(0).getValue();
        } else {
            return null;
        }
    }

    public void remove(K key) {
        l.removeIf(x -> x.getKey() == key);
    }

    public int size() {
        return l.size();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        } else {
            return true;//this.getKey().equals((K) o);
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
