package designpattern.behavior.command.v3;

public class Demo {
    public static void main(String[] args) {
        Commander commander = new Commander();
        Soldier soldier = new Soldier("K");
        commander.command("walk", soldier);
        commander.command("run", soldier);
        commander.command("fly", soldier);
    }
}
