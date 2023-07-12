package main.java.org.designpattern.decorator.milktea.base;


import main.java.org.designpattern.decorator.milktea.topping.*;

public class Main {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        milkTea = new EggPudding(milkTea);
        milkTea = new BlackSugar(milkTea);
        milkTea = new Bubble(milkTea);
        milkTea = new FruitPudding(milkTea);
        milkTea = new WhiteBubble(milkTea);
        System.out.println(milkTea.cost());
    }
}
