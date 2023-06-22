package designpattern.factorymethod;

public class FreeProduct extends Product{
    @Override
    public long getPrice() {
        return 0;
    }
}
