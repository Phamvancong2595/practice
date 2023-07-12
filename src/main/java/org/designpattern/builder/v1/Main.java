package main.java.org.designpattern.builder.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        RobotBuilder builder = null;
        RobotBuildable robot;
        String response = "a";
        System.out.println("Do you want a cookie robot [c] or an automotive robot [a] ?");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = bf.readLine();
        } catch (IOException e) {
            System.err.println("Error!!!");
        }
        if ("c".equals(response)) {
            builder = new CookieRobotBuilder();
        }
        if (builder != null) {
            builder.addStart();
        }
        if (builder != null) {
            builder.addAssemble();
        }
        Objects.requireNonNull(builder).addGetPart();
        builder.addTest();
        builder.addStop();
        robot = builder.getRobot();
        robot.go();
    }
}
