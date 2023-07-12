package main.java.org.designpattern.addapter.acetoacme;

public class TestAddapter {
    public static void main(String[] args) {
        AceClass ace = new AceClass("Pham VanCong");
        AceToAcmeClass aceToAcmeClass = new AceToAcmeClass(ace);
        System.out.println(aceToAcmeClass);
        System.out.println(ace);
    }
}
