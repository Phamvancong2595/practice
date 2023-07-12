package main.java.org.designpattern.addapter.acetoacme;

public class AceClass implements Ace{
    private String name;

    public AceClass(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AceClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
