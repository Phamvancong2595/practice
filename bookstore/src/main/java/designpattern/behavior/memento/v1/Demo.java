package designpattern.behavior.memento.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayDeque;
import java.util.Deque;

public final class Demo {
    @Data
    @AllArgsConstructor
    public static class Memento {
        private String state;
    }
    @Data
    public static class Originator {
        private String state;
        public Memento createMemento() {
            return new Memento(state);
        }
        public void restore(Memento memento) {
            state = memento.getState();
        }
    }
    public static class CareTaker {
        private final Deque<Memento> stack = new ArrayDeque<>();
        public void pushMemento(Memento memento) {
            stack.addFirst(memento);
        }
        public Memento popMemento() {
            return stack.pop();
        }
    }

    public static void main(String[] args) {
        final CareTaker careTaker = new CareTaker();
        final Originator originator = new Originator();
        originator.setState("State 1");
        careTaker.pushMemento(
                originator.createMemento()
        );
        originator.setState("State 2");
        careTaker.pushMemento(
                originator.createMemento()
        );
        originator.restore(careTaker.popMemento());
        System.out.println("Restore state to: " + originator.getState());
        originator.restore(careTaker.popMemento());
        System.out.println("Restore state to: " + originator.getState());
    }
}
