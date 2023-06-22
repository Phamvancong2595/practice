package org.designpattern.decorator.test;

import org.designpattern.decorator.test.base.IMilkTea;
import org.designpattern.decorator.test.base.MilkTea;
import org.designpattern.decorator.test.decorator.BlackSugar;
import org.designpattern.decorator.test.decorator.Bubble;
import org.designpattern.decorator.test.decorator.EggPudding;
import org.designpattern.decorator.test.decorator.FruitPudding;

public class Main {
    public static void main(String[] args) {
        IMilkTea ourMiltea = new EggPudding(new FruitPudding(new BlackSugar(new Bubble(new MilkTea()))));
        System.out.println(ourMiltea.cost());
    }
}
