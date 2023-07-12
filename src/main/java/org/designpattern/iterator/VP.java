package main.java.org.designpattern.iterator;

public class VP {
    private String name;
    private String division;

    public VP(String name, String division) {
        this.name = name;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VP{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
