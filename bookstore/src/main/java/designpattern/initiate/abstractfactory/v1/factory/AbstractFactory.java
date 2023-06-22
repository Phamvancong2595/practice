package designpattern.abstractfactory.v1.factory;

import designpattern.abstractfactory.v1.product.AbstractProductA;
import designpattern.abstractfactory.v1.product.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA newProductA();
    AbstractProductB newProductB();
}
