package main.java.org.designpattern.flyweight;

public class StudentThread {
    private String name;
    private int id;
    private int score;
    private double averageScore;
    private static final StudentThread singleObject = new StudentThread();
    public static StudentThread getInstance() {
        return singleObject;
    }
    private StudentThread() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    public double getStanding() {
        return Math.round(((double) score / averageScore - 1) * 100);
    }

    @Override
    public String toString() {
        return "StudentThread{" +
                "name: '" + name + '\'' +
                "Standing: " + this.getStanding() +
                '}';
    }
}
