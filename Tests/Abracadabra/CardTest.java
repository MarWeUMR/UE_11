package Abracadabra;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CardTest {

    Card c1 = new Card("König", 1900, Card.GREEN);
    Card c2 = new Card("Dame", 1901, Card.WHITE);
    Card c3 = new Card("Bube", 1902, Card.BLACK);
    Card c4 = new Card("Ass", 1903, Card.WHITE);
    Card c5 = new Card("Zehn", 1904, Card.BLUE);
    Card c6 = new Card("Neun", 1905, Card.BLUE);
    Card c7 = new Card("Acht", 1906, Card.GREEN);
    Card c8 = new Card("Sieben", 1907, Card.WHITE);
    Card c9 = new Card("Joker", 1909, Card.WHITE);

    Card[] expected = new Card[]{c1, c2, c3, c4, c5, c6, c7, c8, c8, c9};
    Card[] cRay = new Card[]{c1, c2, c6, c8, c5, c8, c3, c7, c4, c9};


    @Test
    public void compareTo() {

        Arrays.sort(cRay);

        Assert.assertEquals(expected, cRay);


    }
}