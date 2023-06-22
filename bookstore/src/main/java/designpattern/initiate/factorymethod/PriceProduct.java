package designpattern.factorymethod;

import lombok.Setter;

public class PriceProduct extends Product{
    @Setter
    private long price;
    @Override
    public long getPrice() {
        return price;
    }
}
