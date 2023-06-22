package org.designpattern.builder;

public interface RobotBuilder {
    public void addStart();
    public void addGetPart();
    void addAssemble();
    void addTest();
    void addStop();
    RobotBuildable getRobot();
}
