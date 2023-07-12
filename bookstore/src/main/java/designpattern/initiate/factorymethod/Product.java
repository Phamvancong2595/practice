package designpattern.initiate.factorymethod;

public abstract class Product {
    private String name;
    public abstract long getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
