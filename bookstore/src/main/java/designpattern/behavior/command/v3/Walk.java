package designpattern.behavior.command.v3;

public class Walk implements Command{
    @Override
    public void execute() {
        System.out.println("Walking!!!");
    }
}
