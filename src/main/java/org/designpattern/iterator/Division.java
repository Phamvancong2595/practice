package main.java.org.designpattern.iterator;

public class Division {
    private String name;
    private int number = 0;
    private VP[] vps = new VP[100];

    public Division(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void add(String n) {
        VP vp = new VP(n, name);
        vps[number ++] = vp;
    }
    public DivisionIterator iterator() {
        return new DivisionIterator(vps);
    }
}
