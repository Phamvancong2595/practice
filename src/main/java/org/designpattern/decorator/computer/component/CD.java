package org.designpattern.decorator.computer;

import org.designpattern.decorator.computer.base.ComponentDecorator;
import org.designpattern.decorator.computer.base.Computer;

public class CD extends ComponentDecorator {
    Computer computer;

    public CD(Computer c) {
        super();
        this.computer = c;
    }
    public String desciption() {
        return computer.description() + "and a CD";
    }
}
