package designpattern.abstractfactory.v1.factory;

import designpattern.abstractfactory.v1.product.AbstractProductA;
import designpattern.abstractfactory.v1.product.AbstractProductB;
import designpattern.abstractfactory.v1.product.ProductA1;
import designpattern.abstractfactory.v1.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA newProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB newProductB() {
        return new ProductB1();
    }
}
