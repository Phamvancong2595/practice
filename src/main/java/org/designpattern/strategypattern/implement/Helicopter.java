package org.designpattern.strategypattern;

public class Helicopter extends Vehicle{
    public Helicopter(){
        setGoAlgorithm(new GoByFlying());
    }
}
