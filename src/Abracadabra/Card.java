package Abracadabra;

public class Card implements Comparable {

    public final static String WHITE = "White";
    public final static String BLUE = "Blue";
    public final static String BLACK = "Black";
    public final static String RED = "Red";
    public final static String GREEN = "Green";

    public enum Color {Green, Red, Black, Blue, White}

    private String name;
    private int year;
    private Color color;


    /**
     * Constructor for a card object
     *
     * @param name
     * @param year
     * @param color
     */
    public Card(String name, int year, Color color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }


    /**
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * @return color
     */
    public Color getColor() {
        return color;
    }


    /**
     * alternative for color value comparison
     *
     * @param color color string code
     * @return color value
     */
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
        if (o == null) { // null check
            throw new NullPointerException();
        }

        Card compareWith = (Card) o;

        if (this.getYear() > compareWith.getYear()) {
            return 1;
        } else if (this.getYear() < compareWith.getYear()) {
            return -1;
        } else {
            if (this.getColor().compareTo(compareWith.getColor()) > 0) {
                return 1;
            } else if (this.getColor().compareTo(compareWith.getColor()) < 0) {
                return -1;
            } else {
                return this.getName().compareTo(compareWith.getName());
            }
        }
    }
}
