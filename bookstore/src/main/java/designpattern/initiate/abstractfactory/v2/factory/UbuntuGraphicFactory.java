package designpattern.abstractfactory.v2.factory;

import designpattern.abstractfactory.v2.product.Graphics;
import designpattern.abstractfactory.v2.product.UbuntuGraphics;

public class UbuntuGraphicFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new UbuntuGraphics();
    }
}
