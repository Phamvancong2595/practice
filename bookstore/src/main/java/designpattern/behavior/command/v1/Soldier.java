package designpattern.behavior.command.v1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Soldier {
    private final String name;
    public void walk() {
        System.out.println(name + " is walking!");
    }
    public void run() {
        System.out.println(name + " is running !");
    }
    public void fly() {
        System.out.println(name + " is flying !");
    }
    public void execute(String command) {
        if ("walk".equals(command)) {
            walk();
        } else if ("run".equals(command)) {
            run();
        } else if ("fly".equals(command)) {
            fly();
        }
    }
}
