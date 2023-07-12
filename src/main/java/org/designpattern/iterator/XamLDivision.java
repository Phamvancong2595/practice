package main.java.org.designpattern.iterator;

public class XamLDivision {
    Division division;
    DivisionIterator iterator;
    public static void main(String[] args) {
        XamLDivision xamLDivision = new XamLDivision();
    }
    public XamLDivision() {
        division = new Division("Sales");
        division.add("A");
        division.add("W");
        division.add("Q");
        division.add("I");
        division.add("K");
        iterator = division.iterator();
        while (iterator.hasNext()) {
            VP vp = (VP) iterator.next();
            System.out.println(vp.toString());
        }
    }
}
