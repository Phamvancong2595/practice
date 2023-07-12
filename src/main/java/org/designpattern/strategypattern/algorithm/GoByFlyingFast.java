package main.java.org.designpattern.strategypattern.algorithm;

public class GoByFlyingFast implements GoAlgorithm {
    @Override
    public void go() {
        System.out.println("Now I'm flying fast.");
    }
}
