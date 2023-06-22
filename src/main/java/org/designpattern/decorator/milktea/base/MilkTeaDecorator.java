package org.designpattern.decorator.test.base;

public abstract class MilkTeaDecorator implements IMilkTea{
    private IMilkTea iMilkTea;
    protected MilkTeaDecorator(IMilkTea inner){
        iMilkTea = inner;
    }
    @Override
    public double cost() {
       return iMilkTea.cost();
    }
}
