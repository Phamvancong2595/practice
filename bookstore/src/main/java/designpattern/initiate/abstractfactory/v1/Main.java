package designpattern.initiate.abstractfactory.v1;

import designpattern.initiate.abstractfactory.v1.factory.AbstractFactory;
import designpattern.initiate.abstractfactory.v1.factory.ConcreteFactory1;
import designpattern.initiate.abstractfactory.v1.factory.ConcreteFactory2;
import designpattern.initiate.abstractfactory.v1.product.AbstractProductA;
import designpattern.initiate.abstractfactory.v1.product.AbstractProductB;

public class Main {
    public static void main(String[] args) {
        final AbstractFactory factory1 = new ConcreteFactory1();
        final AbstractFactory factory2 = new ConcreteFactory2();
        final AbstractProductA productA1 = factory1.newProductA();
        final AbstractProductA productA2 = factory2.newProductA();
        final AbstractProductB productB1 = factory1.newProductB();
        final AbstractProductB productB2 = factory2.newProductB();
    }
   
}
