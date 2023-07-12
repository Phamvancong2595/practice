package main.java.org.designpattern.decorator.computer.component;


import main.java.org.designpattern.decorator.computer.base.ComponentDecorator;
import main.java.org.designpattern.decorator.computer.base.Computer;

public class Disk extends ComponentDecorator {
    Computer computer;

    public Disk(Computer c) {
        super();
        this.computer = c;
    }

    @Override
    public String description() {
        return computer.description() + "and a disk ";
    }
}
