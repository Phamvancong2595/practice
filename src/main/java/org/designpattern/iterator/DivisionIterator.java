package main.java.org.designpattern.iterator;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
    private VP[] vps;
    protected int location = 0;
    public DivisionIterator(VP[] vps) {
        this.vps = vps;
    }

    @Override
    public boolean hasNext() {
        return location < vps.length && vps[location] != null;
    }

    @Override
    public Object next() {
        return vps[location ++];
    }

    @Override
    public void remove() {
    }
}
