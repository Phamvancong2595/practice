package main.java.org.designpattern.strategypattern.algorithm;

public class GoByDrivingAlgorithm implements GoAlgorithm {
    @Override
    public void go() {
        System.out.println("Now I'm driving");
    }
}
