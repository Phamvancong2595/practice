package designpattern.initiate.singleton.demo;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        List<Student> l = s.getStudents();
        l.add(s);
    }
}
