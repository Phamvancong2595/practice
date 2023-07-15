package designpattern.behavior.mediator.demo;

import java.util.Arrays;
import java.util.List;

public final class Application {
    public interface Colleague {
        void setState(int state);
    }
    public static class ConcreteColleague1 implements Colleague {

        @Override
        public void setState(int state) {
            System.out.println("ConcreteColleague1 state: " + state);
        }
    }
    public static class ConcreteColleague2 implements Colleague {

        @Override
        public void setState(int state) {
            System.out.println("ConcreteColleague2 state: " + state);
        }
    }
    public interface Mediator {
        void setState(int state);
    }
    public static class ConcreteMediator implements Mediator {
        private final List<Colleague> colleagues;
        public ConcreteMediator(Colleague ... colleagues) {
            this.colleagues = Arrays.asList(colleagues);
        }

        @Override
        public void setState(int state) {
            colleagues.forEach(colleague -> colleague.setState(state));
        }
    }

    public static void main(String[] args) {
        final Mediator mediator = new ConcreteMediator(
                new ConcreteColleague1(),
                new ConcreteColleague2()
        );
        mediator.setState(123);
    }
}
