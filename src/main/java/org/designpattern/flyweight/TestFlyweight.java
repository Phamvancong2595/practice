package main.java.org.designpattern.flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        String [] name = {"Ralph", "Alice","Same"};
        int [] ids = {1001, 1002, 1003};
        int [] scores = {45, 55, 65};
        int totalS = 0;
        for(int i: scores) totalS += i;
        double averageS = totalS / scores.length;
        Student s1 = new Student(averageS);
        for(int i = 0; i < name.length; i ++) {
            s1.setName(name[i]);
            s1.setId(ids[i]);
            s1.setScore(scores[i]);
            System.out.println(s1);
            System.out.println(System.identityHashCode(s1));
        }

    }
}
