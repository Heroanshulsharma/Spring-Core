package org.springcore.constructorinjectSystem.outn;

public class AmbiguousClass {

    private int first;
    private int second;

    AmbiguousClass(int first, int second){
        System.out.println("int int wala constructor");
        this.first=first;
        this.second=second;
    }
    AmbiguousClass(String first, String second){
        System.out.println("String String wala constructor");
        this.first=Integer.parseInt(first);
        this.second=Integer.parseInt(second);
    }
    AmbiguousClass(double first, double second){
        System.out.println("double double wala constructor");
        this.first = (int) first;
        this.second = (int) second;
    }

    @Override
    public String toString() {
        return "AmbiguousClass{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
