package designpattern.behavior.command.v3;

public class Fly implements Command{
    @Override
    public void execute() {
        System.out.println("Flying to the sky!!!");
    }
}
