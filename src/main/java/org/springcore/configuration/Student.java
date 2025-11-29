package org.springcore.configuration;

public class Student {

    private String name;
    private String address;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String name, String address) {
        System.out.println("Constructor called ");
        this.name = name;
        this.address = address;
    }

    public Student() {
    }
}
