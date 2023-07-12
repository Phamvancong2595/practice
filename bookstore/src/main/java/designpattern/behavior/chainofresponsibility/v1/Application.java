package designpattern.behavior.chainofresponsibility.v1;

import lombok.AllArgsConstructor;

public class Application {
    public static void main(String[] args) {
        final Handler handler = new ConcreteHandler1(
                new ConcreteHandler2()
        );
        handler.handleRequest(new Request());
    }
    public static class Request{}
    @AllArgsConstructor
    public abstract static class Handler {
        protected final Handler successor;
        public Handler() {
            this(null);
        }
        public abstract void handleRequest(
                Request request
        );
    }
    public static class ConcreteHandler1 extends Handler {
        public ConcreteHandler1(Handler successor) {
            super(successor);
        }

        @Override
        public void handleRequest(Request request) {
            System.out.println("ConcreteHandler1 handle: " + request);
            successor.handleRequest(request);
        }
    }
    public static class ConcreteHandler2 extends Handler {

        @Override
        public void handleRequest(Request request) {
            System.out.println("ConcreteHandle2 handle: " + request);
        }
    }


}
