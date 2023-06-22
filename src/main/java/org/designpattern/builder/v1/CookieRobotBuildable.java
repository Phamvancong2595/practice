package org.designpattern.builder;

import java.util.ArrayList;
import java.util.Iterator;

public class CookieRobotBuildable implements RobotBuildable{
    ArrayList<Integer> actions;
    public CookieRobotBuildable() {

    }
    public void loadActions(ArrayList<Integer> a) {
        actions = a;
    }
    @Override
    public void go() {
        for (Integer action : actions) {
            switch (action) {
                case 1:
                    start();
                    break;
                case 2:
                    getParts();
                    break;
                case 3:
                    assemble();
                    break;
                case 4:
                    test();
                    break;
                case 5:
                    stop();
                    break;
            }
        }
    }
    public void start() {
        System.out.println("Starting....");
    }
    public void getParts() {
        System.out.println("Get flour and sugar...");
    }
    public void assemble() {
        System.out.println("Baking a cookie...");
    }
    public void test() {
        System.out.println("Crunching a cookie...");
    }
    public void stop() {
        System.out.println("Stopping...");
    }
}
