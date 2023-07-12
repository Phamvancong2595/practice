package main.java.org.designpattern.template.v2;

public class Main {
    public static void main(String[] args) {
        Daily monday = new WorkDay("Monday");
        monday.action();
        System.out.println();
        Daily sunday = new Weekend("Sunday");
        sunday.action();
    }
}
