package designpattern.behavior.command.v3;

public class Commander {
    public void command(String action, Soldier soldier) {
        soldier.execute(action);
    }
}
