package main.java.org.designpattern.decorator.computer.base;


import main.java.org.designpattern.decorator.computer.component.CD;
import main.java.org.designpattern.decorator.computer.component.Disk;
import main.java.org.designpattern.decorator.computer.component.Monitor;

public class Main {
    public static void main(String[] args) {
      Computer computer = new Computer();
      computer = new Disk(computer);
      computer = new Disk(computer);
      computer = new CD(computer);
      computer = new Monitor(computer);
        System.out.println(computer.description());
    }
}
