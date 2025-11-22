package org.springcore.SetterInjection;

public class Student {

    private Integer studentId;
    private String studentName;
    private String studentAddress;

    public Integer studentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        IO.println("StudentID Setter Called");
        this.studentId = studentId;
    }

    public String studentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        IO.println("Student Name Setter Called");
        this.studentName = studentName;
    }

    public String studentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
                            IO.println("Student Address Setter Called");

        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
