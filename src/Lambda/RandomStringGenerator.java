package Lambda;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStringGenerator implements Supplier<String> {

    private Random rnd = new Random(System.currentTimeMillis());

    public String get() {
        return Stream.generate(() -> rnd.nextInt((122 - 97) + 1) + 97) // generate random character
                .limit(rnd.nextInt((20 - 5) + 1) + 5) // generate random sequence length
                .map(Character::toString) // map integer to string
                .collect(Collectors.joining("")); // join character sequence into a single string variable
    }




}
