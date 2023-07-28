package designpattern.behavior.strategy.v2;

public class Game {
    private GameObject winner;
    private boolean finished;
    private GameObject robot = new Robot();
    private GameObject player = new Player(robot);
    public void start() {
        while (!finished) {
            update();
            checkGameFinish();
        }
        System.out.println("Game finished, winner is: " + winner.getName());
    }
    private void update() {
        robot.operate();
        System.out.println("Robot's strength is: " + robot.getStrength() + ", action: " + robot.getAction());
        player.operate();
        System.out.println("Player's strength is: " + player.getStrength() + ", action: " + player.getAction());
    }
    private void checkGameFinish() {
        if (robot.getStrength() == player.getStrength()) {
            return;
        }
        if (robot.getAction() == Action.ATTACK && player.getAction() == Action.ATTACK) {
            if (robot.getStrength() > player.getStrength()) {
                winner = robot;
            } else {
                winner = player;
            }
            finished = true;
        }
    }
}
