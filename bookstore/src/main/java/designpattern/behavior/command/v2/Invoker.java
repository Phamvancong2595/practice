package designpattern.behavior.command.v2;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private final Map<String, Command> commands;
    public Invoker(Receiver receiver) {
        commands = new HashMap<>();
        commands.put("command1", new ConcreteCommandX(receiver));
        commands.put("command2", new ConcreteCommandY(receiver));
    }
    public void invoke(String command) {
        commands.get(command).execute();
    }
}
