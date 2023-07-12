package designpattern.behavior.command.v2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteCommandY implements Command{
    private final Receiver receiver;
    @Override
    public void execute() {
        receiver.action2();
    }
}
