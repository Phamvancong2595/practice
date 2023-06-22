package designpattern.factorymethod;

public class ProductOrderCreaterImpl extends ProductOderCreater{
    private static final long DEFAULT_PRICE = 1000;
    @Override
    protected Product newProduct(String name) {
        final Product product;
        if (name.endsWith("FREE!")) {
            product = new FreeProduct();
        } else {
            final PriceProduct priceProduct = new PriceProduct();
            priceProduct.setPrice(DEFAULT_PRICE);
            product = priceProduct;
        }
        product.setName(name);
        return product;
    }
}
