package main.java.org.designpattern.addapter.acetoacme;

public class AceToAcmeClass implements Acme{
    private AceClass aceClass;
    private String firstName;
    private String lastName;

    public AceToAcmeClass(AceClass aceClass) {
        this.aceClass = aceClass;
        this.firstName = aceClass.getName().split(" ")[0];
        this.lastName = aceClass.getName().split(" ")[1];
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "AceToAcmeClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
