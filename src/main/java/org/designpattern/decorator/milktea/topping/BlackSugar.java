package main.java.org.designpattern.decorator.milktea.topping;


import main.java.org.designpattern.decorator.milktea.base.MilkTea;
import main.java.org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

    private MilkTea milkTea;

    public BlackSugar(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return 5.0 + milkTea.cost();
    }
}
