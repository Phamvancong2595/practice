package main.java.org.designpattern.builder.v2;

public class Account {
    private final int id;
    private final String email;
    private final Address address;
    private final Name name;

    private Account(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.email = builder.email;
        this.name = builder.name;
    }
    public static class Builder {
        private int id;
        private String email;
        private Address address;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }
        public Builder email(final String email) {
            this.email = email;
            return this;
        }
        public Builder name(final Name name) {
            this.name = name;
            return this;
        }
        public Builder address(final Address address) {
            this.address = address;
            return this;
        }
        public Account build() {
            return new Account(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", name=" + name +
                '}';
    }
}
