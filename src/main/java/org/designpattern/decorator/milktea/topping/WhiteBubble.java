package org.designpattern.decorator.milktea.decorator;

import org.designpattern.decorator.milktea.base.IMilkTea;
import org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    protected WhiteBubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }
}
