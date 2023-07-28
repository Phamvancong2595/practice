package designpattern.behavior.strategy.v2;


public class Player extends GameObject {
    private final GameObject competitor;

    public Player(GameObject competitor) {
        this.competitor = competitor;
    }

    @Override
    public String getName() {
        return "Player";
    }
}
