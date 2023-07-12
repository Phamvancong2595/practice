package main.java.org.designpattern.template.v1;

public abstract class AbstractClass {
    public void templateMethod(){
        operation1();
        operation2();
        operation3();
    }
    protected abstract void operation1();
    protected abstract void operation2();
    protected abstract void operation3();
}
