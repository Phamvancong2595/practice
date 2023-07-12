package main.java.org.designpattern.builder.v1;

public interface RobotBuilder {
    public void addStart();
    public void addGetPart();
    void addAssemble();
    void addTest();
    void addStop();
    RobotBuildable getRobot();
}
