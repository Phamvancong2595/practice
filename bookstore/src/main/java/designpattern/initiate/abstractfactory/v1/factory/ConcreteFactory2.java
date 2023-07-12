package designpattern.initiate.abstractfactory.v1.factory;

import designpattern.initiate.abstractfactory.v1.product.AbstractProductA;
import designpattern.initiate.abstractfactory.v1.product.AbstractProductB;
import designpattern.initiate.abstractfactory.v1.product.ProductA2;
import designpattern.initiate.abstractfactory.v1.product.ProductB2;

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
