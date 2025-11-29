package org.springcore.beanlifecycle;

public class Student {

    private Integer value;



    public Integer value() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Student{" +
                "value=" + value +
                '}';
    }

    public void init(){
        System.out.println("Init method called");
    }

    public void destroy(){
        System.out.println("Destroy method called");
    }
}
