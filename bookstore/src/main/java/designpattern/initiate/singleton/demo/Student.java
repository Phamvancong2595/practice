package designpattern.initiate.singleton.demo;

import java.util.List;

public class Student {
    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
