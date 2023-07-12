package main.java.org.designpattern.strategypattern.implement;


import main.java.org.designpattern.strategypattern.algorithm.GoByFlyingFast;

public class Jet extends Vehicle {
    public Jet(){
        setGoAlgorithm(new GoByFlyingFast());
    }
}
