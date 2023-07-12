package main.java.org.designpattern.template.v2;

public abstract class Daily {
    public void action() {
        drinkTea();
        breakFast();
        learnMySql();
        doProblemSolving();
        if(isWorkDay()) {
            go();
        }
    }
    public void drinkTea() {
        System.out.println("Drinking...");
    }
    public void breakFast() {
        System.out.println("Eating...");
    }
    public void learnMySql() {
        System.out.println("Learning...");
    }
    public void doProblemSolving() {
        System.out.println("Doing...");
    }
    public void go() {
        System.out.println("Driving");
    }
    public boolean isWorkDay() {
        return false;
    }
}
