package main.java.org.designpattern.singleton;

public class DatabaseThreaded {
    private static DatabaseThreaded singleObject = new DatabaseThreaded("product");
    private int record;
    private String name;
    private DatabaseThreaded(String name) {
        this.name = name;
        record = 0;
    }
    public static synchronized DatabaseThreaded getInstance(String name) {
        return singleObject;
    }
    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + " operation on record " +  record + " in database " + name);
    }
    public String getName() {
        return this.name;
    }
}
