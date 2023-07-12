package main.java.org.designpattern.strategypattern;


import main.java.org.designpattern.strategypattern.algorithm.GoByDrivingAlgorithm;
import main.java.org.designpattern.strategypattern.implement.Jet;

public class Main {
    public static void main(String[] args) {
        Jet jet = new Jet();
        jet.setGoAlgorithm(new GoByDrivingAlgorithm());
        jet.go();
    }
}
