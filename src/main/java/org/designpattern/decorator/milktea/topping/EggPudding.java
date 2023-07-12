package main.java.org.designpattern.decorator.milktea.topping;


import main.java.org.designpattern.decorator.milktea.base.MilkTea;
import main.java.org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
   private MilkTea milkTea;

    public EggPudding(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return milkTea.cost() + 10.0;
    }
}
