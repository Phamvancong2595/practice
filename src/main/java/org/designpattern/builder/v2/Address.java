package main.java.org.designpattern.builder.v2;

public class Address {
    private final String stress;
    private final String zipcode;
    private final String city;
    private Address(Builder builder) {
        this.city = builder.city;
        this.zipcode = builder.zipcode;
        this.stress = builder.stress;
    }
    public static class Builder {
        private String stress;
        private String zipcode;
        private String city;
        public Builder stress(String stress) {
            this.stress = stress;
            return this;
        }
        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }

    public String getStress() {
        return stress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "stress='" + stress + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
