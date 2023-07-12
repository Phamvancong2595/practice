package main.java.org.designpattern.builder.v2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Name name = new Name
                .Builder()
                .firstName("Pham")
                .middleName(List.of("Van"))
                .surName("Cong")
                .build();
        Address address = new Address
                .Builder()
                .city("Hanoi")
                .zipcode("100000")
                .stress("Phung Khoang")
                .build();
        Account congpv = new Account
                .Builder()
                .id(1)
                .email("congpv@rikkeisoft.com")
                .address(address)
                .name(name)
                .build();
        System.out.println(congpv);
    }
}
