package org.designpattern.decorator.computer;

import org.designpattern.decorator.computer.base.ComponentDecorator;
import org.designpattern.decorator.computer.base.Computer;

public class Disk extends ComponentDecorator {
    Computer computer;

    public Disk(Computer c) {
        super();
        this.computer = c;
    }

    public String desciption() {
        return computer.description() + "and a disk";
    }
}
