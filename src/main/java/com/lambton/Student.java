package com.lambton;

import java.util.ArrayList;

public class Student {
    int StudentId;
    String Firstname;
    String Lastname;
    ArrayList<SubjectAndMarks> Marks = new ArrayList<SubjectAndMarks>();
    int total;
    float percentage;
    String Result;


    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public ArrayList<SubjectAndMarks> getMarks() {
        return Marks;
    }

    public void setMarks(ArrayList<SubjectAndMarks> marks) {
        Marks = marks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
}
