package designpattern.initiate.abstractfactory.v1.factory;

import designpattern.initiate.abstractfactory.v1.product.AbstractProductA;
import designpattern.initiate.abstractfactory.v1.product.AbstractProductB;
import designpattern.initiate.abstractfactory.v1.product.ProductA1;
import designpattern.initiate.abstractfactory.v1.product.ProductB1;

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
