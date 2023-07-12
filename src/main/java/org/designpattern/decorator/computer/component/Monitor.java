package main.java.org.designpattern.decorator.computer.component;


import main.java.org.designpattern.decorator.computer.base.ComponentDecorator;
import main.java.org.designpattern.decorator.computer.base.Computer;

public class Monitor extends ComponentDecorator {
    Computer computer;

    public Monitor(Computer c) {
        super();
        this.computer = c;
    }

    @Override
    public String description() {
        return computer.description() + "add a monitor ";
    }
}
