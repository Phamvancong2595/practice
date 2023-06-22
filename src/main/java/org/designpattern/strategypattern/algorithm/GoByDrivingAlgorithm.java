package org.designpattern.strategypattern;

public class GoByDrivingAlgorithm implements GoAlgorithm{
    @Override
    public void go() {
        System.out.println("Now I'm driving");
    }
}
