package org.designpattern.decorator.milktea.decorator;

import org.designpattern.decorator.milktea.base.IMilkTea;
import org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1.0 + super.cost();
    }
}
