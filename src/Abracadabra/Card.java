package Abracadabra;

public class Card implements Comparable {

    public final static String WHITE = "White";
    public final static String BLUE = "Blue";
    public final static String BLACK = "Black";
    public final static String RED = "Red";
    public final static String GREEN = "Green";

    private String name;
    private int year;
    private String color;

    public Card(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    private int getColorValue(String color) {
        int code = 0;
        switch (color) {
            case "WHITE":
                code = 5;
                break;
            case "BLUE":
                code = 4;
                break;
            case "BLACK":
                code = 3;
            case "RED":
                code = 2;
            case "GREEN":
                code = 1;
            default:
                code = -1;
        }

        return code;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }

        Card compareWith = (Card) o;

        if (this.getYear() > compareWith.getYear()) {
            return 1;
        } else if (this.getYear() < compareWith.getYear()) {
            return -1;
        } else {
            if (this.getColorValue(this.getColor()) > compareWith.getColorValue(compareWith.getColor())) {
                return 1;
            } else if (this.getColorValue(this.getColor()) < compareWith.getColorValue(compareWith.getColor())) {
                return -1;
            } else {
                return this.getName().compareTo(compareWith.getName());
            }
        }
    }
}
