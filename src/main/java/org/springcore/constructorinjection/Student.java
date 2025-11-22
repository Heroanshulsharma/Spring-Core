package org.springcore.constructorinjection;

import java.util.List;

public class Student {

    private String name;
    private Teacher teacher;
    private List<String> subjects;

    public Student(String name, Teacher teacher, List<String> subjects) {
        this.name = name;
        this.teacher = teacher;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", subjects=" + subjects +
                '}';
    }
}
