package main.java.org.designpattern.decorator.computer.component;


import main.java.org.designpattern.decorator.computer.base.ComponentDecorator;
import main.java.org.designpattern.decorator.computer.base.Computer;

public class CD extends ComponentDecorator {
    Computer computer;

    public CD(Computer c) {
        super();

        this.computer = c;
    }

    @Override
    public String description() {
        return computer.description() + "add a CD ";
    }
}
