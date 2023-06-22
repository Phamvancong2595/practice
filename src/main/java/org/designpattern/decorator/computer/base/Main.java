package org.designpattern.decorator.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new CD(computer);
        computer = new Disk(computer);
        System.out.println("You are getting a " + computer.description() + ".");
    }
}
