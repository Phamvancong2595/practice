package main.java.org.designpattern.state;

public interface AutomatInterface {
    void gotApplication();
    void checkApplication();
    void rentApartment();
    void setState(State s);
    State getWaitingState();
    State getGotApplicationState();
    State getApartmentRentedState();
    State getFullRentedState();
    int getCount();
    void setCount(int n);
}
