package org.springcore.configuration;

public class Teacher {

    private Student student;

    public Student student() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                '}';
    }
}
