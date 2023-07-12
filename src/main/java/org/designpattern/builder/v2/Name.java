package main.java.org.designpattern.builder.v2;

import java.util.List;

public class Name {
    private final String firstName;
    private final List<String> middleName;
    private final String surname;
    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.surname = builder.surName;
    }
    public static class Builder {
        private String firstName;
        private List<String> middleName;
        private String surName;
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder middleName(List<String> middleName) {
            this.middleName = middleName;
            return this;
        }
        public Builder surName(String surName) {
            this.surName = surName;
            return this;
        }
        public Name build() {
            return new Name(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName=" + middleName +
                ", surname='" + surname + '\'' +
                '}';
    }
}
