package org.designpattern.strategypattern;

public class Jet extends Vehicle{
    public Jet(){
        setGoAlgorithm(new GoByFlyingFast());
    }
}
