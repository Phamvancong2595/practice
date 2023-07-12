package main.java.org.designpattern.builder.v1;

import java.util.ArrayList;

public class CookieRobotBuilder implements RobotBuilder {
    CookieRobotBuildable robot;
    ArrayList<Integer> actions;
    public CookieRobotBuilder() {
        robot = new CookieRobotBuildable();
        actions = new ArrayList<>();
    }
    @Override
    public void addStart() {
        actions.add(1);
    }

    @Override
    public void addGetPart() {
        actions.add(2);
    }

    @Override
    public void addAssemble() {
        actions.add(3);
    }

    @Override
    public void addTest() {
        actions.add(4);
    }

    @Override
    public void addStop() {
        actions.add(5);
    }

    @Override
    public RobotBuildable getRobot() {
        robot.loadActions(actions);
        return robot;
    }
}
