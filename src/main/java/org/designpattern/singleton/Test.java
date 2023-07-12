package main.java.org.designpattern.singleton;

public class Test implements Runnable {
    Thread thread;
    public static void main(String[] args) {
        Test t = new Test();
    }
    public Test() {
        DatabaseThreaded databaseThreaded;
        databaseThreaded = DatabaseThreaded.getInstance("products");
        thread = new Thread(this, "second");
        thread.start();
        System.out.println("This is the " + databaseThreaded.getName() + " database. ");
    }

    @Override
    public void run() {
        DatabaseThreaded databaseThreaded;
        databaseThreaded = DatabaseThreaded.getInstance("employees");
        System.out.println("This is the " + databaseThreaded.getName() + "database.");
    }
}
