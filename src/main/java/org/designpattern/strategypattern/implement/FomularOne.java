package org.designpattern.strategypattern;

public class FomularOne extends Vehicle{
    public FomularOne(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
