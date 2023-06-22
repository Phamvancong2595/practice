package org.designpattern.strategypattern;

public class GoByFlyingFast implements GoAlgorithm{
    @Override
    public void go() {
        System.out.println("Now I'm flying fast.");
    }
}
