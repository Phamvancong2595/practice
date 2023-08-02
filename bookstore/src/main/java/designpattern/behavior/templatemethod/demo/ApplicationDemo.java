package designpattern.behavior.templatemethod.demo;

public final class ApplicationDemo {
    public abstract static class AbstractClass {
        public void templateMethod() {
            primitiveOperationA();
            primitiveOperationB();
        }
        protected abstract void primitiveOperationA();
        protected abstract void primitiveOperationB();
    }
    public static class ConcreteClass extends AbstractClass {

        @Override
        protected void primitiveOperationA() {
            System.out.println("Operation A:");
        }

        @Override
        protected void primitiveOperationB() {
            System.out.println("Operation B:");
        }
    }

    public static void main(String[] args) {
        final AbstractClass obj = new ConcreteClass();
        obj.templateMethod();
    }
}
