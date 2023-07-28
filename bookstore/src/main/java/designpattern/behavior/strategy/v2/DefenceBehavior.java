package designpattern.behavior.strategy.v2;

public class DefenceBehavior implements Behavior{
    @Override
    public Action getAction() {
        return Action.DEFENCE;
    }
}
