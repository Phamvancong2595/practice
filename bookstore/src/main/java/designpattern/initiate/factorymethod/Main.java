package designpattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        final ProductOderCreater creator = new ProductOrderCreaterImpl();
        creator.orderProduct("Book FREE!", 1);
        creator.orderProduct("Computer", 2);
    }
}
