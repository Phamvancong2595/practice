package designpattern.abstractfactory.v1.factory;

import designpattern.abstractfactory.v1.product.AbstractProductA;
import designpattern.abstractfactory.v1.product.AbstractProductB;
import designpattern.abstractfactory.v1.product.ProductA2;
import designpattern.abstractfactory.v1.product.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA newProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB newProductB() {
        return new ProductB2();
    }
}
