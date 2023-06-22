package org.designpattern.decorator.computer;

import org.designpattern.decorator.computer.base.ComponentDecorator;
import org.designpattern.decorator.computer.base.Computer;

public class Monitor extends ComponentDecorator {
    Computer computer;

    public Monitor(Computer c) {
        super();
        this.computer = c;
    }

    public String desciption() {
        return computer.description() + "and a monitor";
    }
}
