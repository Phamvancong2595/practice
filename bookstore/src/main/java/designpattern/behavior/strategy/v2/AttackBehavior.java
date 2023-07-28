package designpattern.behavior.strategy.v2;

public class AttackBehavior implements Behavior {
    @Override
    public Action getAction() {
        return Action.ATTACK;
    }
}
