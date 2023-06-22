package org.designpattern.decorator.milktea.decorator;

import org.designpattern.decorator.milktea.base.IMilkTea;
import org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 10 + super.cost();
    }
}
