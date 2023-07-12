package main.java.org.designpattern.strategypattern.implement;


import main.java.org.designpattern.strategypattern.algorithm.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {
    public StreetRacer(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
