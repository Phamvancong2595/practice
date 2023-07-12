package main.java.org.designpattern.state;

public class Automat implements AutomatInterface {
    State waitingState;
    State gotApplicationState;
    State appartmentRentedState;
    State state;
    int count;

    public Automat(State waitingState, State gotApplicationState, State appartmentRentedState, State state, int count) {
        this.waitingState = waitingState;
        this.gotApplicationState = gotApplicationState;
        this.appartmentRentedState = appartmentRentedState;
        this.state = state;
        this.count = count;
    }
    public void gotApplication() {
        System.out.println(state.gotApplication());
    }
    public void checkApplication() {
        System.out.println(state.rentAppartment());
        System.out.println(state.dispenseKeys());
    }

    @Override
    public void rentApartment() {

    }

    public State getAppartmentRentedState() {
        return appartmentRentedState;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int n) {
        count = n;
    }
    public void setState(State s) {
        state = s;
    }

    @Override
    public State getWaitingState() {
        return null;
    }

    @Override
    public State getGotApplicationState() {
        return null;
    }

    @Override
    public State getApartmentRentedState() {
        return null;
    }

    @Override
    public State getFullRentedState() {
        return null;
    }
}
