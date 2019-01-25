package Lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas {

    public static void main(String[] args) {

        // Create a list of 10 randomly generated character sequences
        List<String> a = Stream.generate(new RandomStringGenerator())
                .limit(10)
                .collect(Collectors.toList());
        System.out.println("Pre-sorted: ");
        System.out.println(a);

        System.out.println("Sorted by length:");
        a.sort(Comparator.comparing(String::length));
        System.out.println(a);

        System.out.println("Sorted by first character");
        a.sort((String s1, String s2) -> Integer.compare(s1.toLowerCase().charAt(0), s2.toLowerCase().charAt(0)));
        System.out.println(a);

        System.out.println("Reversed elements");
        a.forEach((String s) -> new StringReverser().accept(s));


    }
}
