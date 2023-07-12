package designpattern.initiate.prototype.v1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Application {
    @Data
    public static abstract class Prototype implements Cloneable {
        protected String property;
        public abstract Prototype clone();
    }
    @Getter
    @Setter
    @ToString
    public static class ConcretePrototype1 extends Prototype {
        private String property1;

        @Override
        public Prototype clone() {
            final ConcretePrototype1 prototype = new ConcretePrototype1();
            prototype.property = property;
            prototype.property1 = property1;
            return prototype;
        }
    }
    @Getter
    @Setter
    @ToString
    public static class  ConcretePrototype2 extends Prototype {
        private String prototype2;

        @Override
        public Prototype clone() {
            final ConcretePrototype2 prototype = new ConcretePrototype2();
            prototype.property = property;
            prototype.prototype2 = prototype2;
            return prototype;
        }
    }

    public static void main(String[] args) {
        final ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setProperty("Hello");
        prototype1.setProperty1("Foo");
        final Prototype copy = prototype1.clone();
        System.out.println(copy);
    }
}
