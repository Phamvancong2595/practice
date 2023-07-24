package designpattern.behavior.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.*;

public class Demo {
    public interface Observer {
        void update(String state);
    }
    public static class ConcreteObserver1 implements Observer {

        @Override
        public void update(String state) {
            System.out.println("Observer 1 update state: " + state);
        }
    }
    public static class ConcreteObserver2 implements Observer {

        @Override
        public void update(String state) {
            System.out.println("Observer 2 update state: " + state);
        }
    }
    public interface Observerable {
        void setState(String state);
        void attach(Observer observer);
        void detach(Observer observer);
        void notifyNewState();
    }
    public static class ConcreteObserverable implements Observerable {
        @Setter
        private String state;
        private final List<Observer> observers = new ArrayList<>();

        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyNewState() {
            observers.forEach(observer -> observer.update(state));
        }
    }

    public static void main(String[] args) {
        final Observerable observerable = new ConcreteObserverable();
        observerable.attach(new ConcreteObserver1());
        observerable.attach(new ConcreteObserver2());
        observerable.setState("New state");
        observerable.notifyNewState();
    }
}
