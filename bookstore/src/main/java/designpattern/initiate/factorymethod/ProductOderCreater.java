package designpattern.factorymethod;

public abstract class ProductOderCreater {
    public void orderProduct(String productName, long amount){
        final Product product = newProduct(productName);

    }
    protected abstract Product newProduct(String name);
    private void storeOrder(Product product, long amount){}
}
