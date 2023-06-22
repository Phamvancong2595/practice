package org.designpattern.decorator.milktea.decorator;

import org.designpattern.decorator.milktea.base.IMilkTea;
import org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 2.0 + super.cost();
    }
}
