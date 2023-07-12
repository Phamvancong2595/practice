package main.java.org.designpattern.strategypattern.implement;


import main.java.org.designpattern.strategypattern.algorithm.GoAlgorithm;

public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;
    public Vehicle(){

    }
    public void setGoAlgorithm(GoAlgorithm goAlgorithm){
        this.goAlgorithm = goAlgorithm;
    }
    public void go(){
        goAlgorithm.go();
    }
}
