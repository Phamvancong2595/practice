package main.java.org.designpattern.strategypattern.implement;


import main.java.org.designpattern.strategypattern.algorithm.GoByDrivingAlgorithm;

public class FomularOne extends Vehicle {
    public FomularOne(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
