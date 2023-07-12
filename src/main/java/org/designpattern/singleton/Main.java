package main.java.org.designpattern.singleton;

public class Main implements Runnable{
    Thread thread;
    public static void main(String[] args) {
        Main m = new Main();
    }
    public Main() {
        Database database;
        database = Database.getInstance("products");
        thread = new Thread(this, "second");
        thread.start();
        System.out.println("This is the " + database.getName() + " database");
    }

    @Override
    public void run() {
        Database database = Database.getInstance("employees");
        System.out.println("This is the " + database.getName() + " database.");
    }
}
