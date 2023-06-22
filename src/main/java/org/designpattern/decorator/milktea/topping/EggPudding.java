package org.designpattern.decorator.milktea.decorator;

import org.designpattern.decorator.milktea.base.IMilkTea;
import org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 5.0 + super.cost();
    }
}
