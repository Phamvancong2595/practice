package main.java.org.leetcode.string.countmatches;

public class Element {
   public static final String TYPE = "type";
   public static final String COLOR = "color";
   public static final String NAME = "name";
    private String type;
    private String color;
    private String name;

    public Element(String type, String color, String name) {
        this.type = type;
        this.color = color;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
