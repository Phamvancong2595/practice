package main.java.org.designpattern.decorator.milktea.topping;


import main.java.org.designpattern.decorator.milktea.base.MilkTea;
import main.java.org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
   private MilkTea milkTea;

    public FruitPudding(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return 20 + milkTea.cost();
    }
}
