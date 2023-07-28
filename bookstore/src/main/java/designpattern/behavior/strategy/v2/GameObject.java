package designpattern.behavior.strategy.v2;

import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
public abstract class GameObject {
    protected int strength;
    protected Action action;
    protected Behavior behavior;
    protected final Behavior[] behaviors = {
            new AttackBehavior(),
            new DefenceBehavior()
    };
    public final void operate() {
        strength = ThreadLocalRandom
                .current()
                .nextInt(1,10);
        update();
    }
    public final void update() {
        final int index = ThreadLocalRandom
                .current()
                .nextInt(behaviors.length);
        behavior = behaviors[index];
        action = behavior.getAction();
    }
    public abstract String getName();
}
