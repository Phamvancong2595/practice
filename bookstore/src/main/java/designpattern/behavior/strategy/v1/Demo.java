package designpattern.behavior.strategy.v1;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy1());
        context.doSomeMethod();
        context.setStrategy(new ConcreteStrategy2());
        context.doSomeMethod();
        context.setStrategy(new ConcreteStrategy3());
        context.doSomeMethod();
    }
}
