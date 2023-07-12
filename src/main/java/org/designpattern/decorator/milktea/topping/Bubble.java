package main.java.org.designpattern.decorator.milktea.topping;


import main.java.org.designpattern.decorator.milktea.base.MilkTea;
import main.java.org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
   private MilkTea milkTea;

    public Bubble(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return 1.0 + milkTea.cost();
    }
}
