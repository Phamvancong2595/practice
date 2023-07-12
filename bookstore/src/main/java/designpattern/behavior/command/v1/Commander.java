package designpattern.behavior.command.v1;

public class Commander {
    public void command(String action, Soldier soldier) {
        soldier.execute(action);
    }
}
