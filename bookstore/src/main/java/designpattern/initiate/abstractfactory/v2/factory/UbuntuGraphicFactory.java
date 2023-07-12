package designpattern.initiate.abstractfactory.v2.factory;

import designpattern.initiate.abstractfactory.v2.product.Graphics;
import designpattern.initiate.abstractfactory.v2.product.UbuntuGraphics;

public class UbuntuGraphicFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new UbuntuGraphics();
    }
}
