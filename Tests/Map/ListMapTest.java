package Map;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListMapTest {

    Entry<Integer, String> e1_0 = new Entry<>(1, "eins");
    Entry<Integer, String> e1_1 = new Entry<>(1, "one");
    Entry<Integer, String> e1_2 = new Entry<>(11, "Price");
    Entry<Integer, String> e1_3 = new Entry<>(12, "Price");


    ListMap<Integer, String> l = new ListMap<>();


    @Test
    public void put() {
        l.put(1, "eins");
        l.put(1, "one");
        l.put(11, "Price");
        l.put(12, "Price");

        Assert.assertEquals(3, l.size());


    }

    @Test
    public void get() {
        l.put(1, "eins");
        l.put(1, "one");
        l.put(11, "Price");
        l.put(12, "Price");

        Assert.assertEquals("one", l.get(1));
        Assert.assertEquals(null, l.get(14));
    }

    @Test
    public void remove() {
    }
}