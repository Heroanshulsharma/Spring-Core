package org.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component ("employee")
public class Employee {

    @Value("Anshul")
    private String name;

    @Value("Sharma")
    private String address;

    @Value("#{listid}")
    private List list;

    @Value("#{10<5?10:5}")
    private Integer value;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double sqrt;

    @Value("#{T(java.lang.Math).PI}")
    private double piValue;

    @Value("#{new java.lang.String('Anshul Sharma')}")
    private  String stringObject;

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

    public List list() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Integer value() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public double sqrt() {
        return sqrt;
    }

    public void setSqrt(double sqrt) {
        this.sqrt = sqrt;
    }

    public double piValue() {
        return piValue;
    }

    public void setPiValue(double piValue) {
        this.piValue = piValue;
    }

    public String stringObject() {
        return stringObject;
    }

    public void setStringObject(String stringObject) {
        this.stringObject = stringObject;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", list=" + list +
                ", value=" + value +
                ", sqrt=" + sqrt +
                ", piValue=" + piValue +
                ", stringObject='" + stringObject + '\'' +
                '}';
    }
}
