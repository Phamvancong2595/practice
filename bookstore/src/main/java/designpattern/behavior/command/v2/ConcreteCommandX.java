package designpattern.behavior.command.v2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteCommandX implements Command{
    private final Receiver receiver;
    @Override
    public void execute() {
        receiver.action1();
    }
}
