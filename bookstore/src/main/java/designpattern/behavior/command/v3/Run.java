package designpattern.behavior.command.v3;

public class Run implements Command{
    @Override
    public void execute() {
        System.out.println("Running!!!");
    }
}
