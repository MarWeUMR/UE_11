package Lambda;

import java.util.function.Consumer;

public class StringReverser implements Consumer<String> {


    @Override
    public void accept(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        System.out.println(temp);
    }
}
