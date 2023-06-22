package designpattern.abstractfactory.v2.product;

public class WindowGraphics implements Graphics{
    @Override
    public void draw() {
        System.out.println("Windows draw");
    }
}
