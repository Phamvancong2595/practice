package main.java.org.designpattern.template.v2;

public class Weekend extends Daily{
    private final String name;
    public Weekend(String name) {
        this.name =  name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void breakFast() {
        System.out.println("On Weekend I eat more protein");
    }

    @Override
    public void drinkTea() {
        System.out.println("On Weekend I drink 2 cup of tea");
    }

}
