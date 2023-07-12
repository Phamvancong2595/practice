package main.java.org.designpattern.strategypattern.implement;


import main.java.org.designpattern.strategypattern.algorithm.GoByFlying;

public class Helicopter extends Vehicle {
    public Helicopter(){
        setGoAlgorithm(new GoByFlying());
    }
}
