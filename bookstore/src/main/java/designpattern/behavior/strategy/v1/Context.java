package designpattern.behavior.strategy.v1;

import lombok.Setter;

public class Context {
    @Setter
    private Strategy strategy;
    public void doSomeMethod() {
        strategy.doBehavior();
    }
}
