package designpattern.abstractfactory.v2.factory;

import designpattern.abstractfactory.v2.product.Graphics;
import designpattern.abstractfactory.v2.product.WindowGraphics;

public class WindowsGraphicFactory implements GraphicsFactory{
    @Override
    public Graphics newGraphics() {
        return new WindowGraphics();
    }
}
