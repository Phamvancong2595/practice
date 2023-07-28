package designpattern.behavior.strategy.v1;

public class ConcreteStrategy1 implements Strategy{
    @Override
    public void doBehavior() {
        System.out.println("Do behavior A");
    }
}
