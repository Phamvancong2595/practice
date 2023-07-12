package designpattern.behavior.command.v1;

public class Demo {
    public static void main(String[] args) {
        Commander commander = new Commander();
        Soldier soldier = new Soldier("X");
        commander.command("run",soldier);
        commander.command("fly", soldier);
    }
}
