package designpattern.abstractfactory.v2.factory;

import designpattern.abstractfactory.v2.product.Graphics;

public class GraphicsFactoryImpl implements GraphicsFactory{
    private final GraphicsFactory windowsGraphicsFactory = new WindowsGraphicFactory();
    private final GraphicsFactory ubuntuGraphicsFactory = new UbuntuGraphicFactory();
    @Override
    public Graphics newGraphics() {
        final String os = System.getProperty("os.name");
        if ("windows".equals(os)) {
            return windowsGraphicsFactory.newGraphics();
        } else {
            return ubuntuGraphicsFactory.newGraphics();
        }
    }
}
