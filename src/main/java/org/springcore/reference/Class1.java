package org.springcore.reference;

public class Class1 {
    private String name;
    private Class2 class2;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class2 class2() {
        return class2;
    }

    public void setClass2(Class2 class2) {
        this.class2 = class2;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", class2=" + class2 +
                '}';
    }
}
