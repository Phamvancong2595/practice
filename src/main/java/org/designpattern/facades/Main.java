package main.java.org.designpattern.facades;

public class Main {
    public static void main(String[] args) {
        DifficultProduct p = new DifficultProduct();
        p.setFirstNameCharacter('c');
        p.setSecondNameCharacter('o');
        p.setThirdNameCharacter('n');
        p.setFourthNameCharacter('g');
        p.setFifthNameCharacter('p');
        p.setSixthNameCharacter('h');
        p.setSeventhNameCharacter('a');
        System.out.println(p.getName());
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("congpham");
        System.out.println(simpleProductFacade.getName());
    }
}
