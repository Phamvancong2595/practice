package designpattern.behavior.command.v3;

import java.util.HashMap;
import java.util.Map;

public class Soldier {
    private final String name;
    private Command command;
    private final Map<String, Command> commands;
    public Soldier(String name) {
        this.name = name;
        this.commands = new HashMap<>();
        commands.put("walk",this::walk);
        commands.put("run", this::run);
        commands.put("fly", this::fly);
    }

    private void fly() {
        command = new Fly();
        command.execute();
    }

    private void run() {
        command = new Run();
        command.execute();
    }

    private void walk() {
        Command command = new Walk();
        command.execute();
    }

    public void execute(String command) {
        commands.get(command).execute();
    }
}
