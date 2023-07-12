package main.java.org.designpattern.decorator.milktea.topping;


import main.java.org.designpattern.decorator.milktea.base.MilkTea;
import main.java.org.designpattern.decorator.milktea.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
  private MilkTea milkTea;

    public WhiteBubble(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public double cost() {
        return milkTea.cost() + 30;
    }
}
