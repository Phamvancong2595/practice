package main.java.org.designpattern.template.v2;

public class WorkDay extends Daily{
    public String getName() {
        return name;
    }

    @Override
    public void action() {
        super.action();
    }

    private final String name;

    public WorkDay(String name) {
        this.name = name;
    }
    public void doProblemSolving() {
        System.out.println("Do some excercises in Hackerank");
    }
    public void learnMySql() {
        System.out.println("Reading Sql performance");
    }

    @Override
    public boolean isWorkDay() {
        return true;
    }
}
