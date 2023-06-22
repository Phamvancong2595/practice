package org.designpattern.template;

public class ConcreteClass extends AbstractClass {

    @Override
    protected void operation1() {
        System.out.println("Get up at 4 a.m");
    }

    @Override
    protected void operation2() {
        System.out.println("Lean MySQL");
    }

    @Override
    protected void operation3() {
        System.out.println("Learn Design Pattern");
    }
}
