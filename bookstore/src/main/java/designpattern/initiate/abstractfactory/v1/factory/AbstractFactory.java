package designpattern.initiate.abstractfactory.v1.factory;

import designpattern.initiate.abstractfactory.v1.product.AbstractProductA;
import designpattern.initiate.abstractfactory.v1.product.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA newProductA();
    AbstractProductB newProductB();
}
