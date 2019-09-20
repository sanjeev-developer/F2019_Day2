package com.lambton;

import jdk.vm.ci.aarch64.AArch64;

import java.util.ArrayList;

public class CollegeExample {

    public static void main(String args[]) {

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(5,4);
        arithmetic.multiply(5,4);
        arithmetic.divide(5,4);
        arithmetic.subtract(5,4);

        ArrayList<SubjectAndMarks> studentresult = new ArrayList<SubjectAndMarks>();

        SubjectAndMarks MathsMarks = new SubjectAndMarks();
        MathsMarks.setSubject("Maths");
        MathsMarks.setMarks(100);
        studentresult.add(MathsMarks);


        SubjectAndMarks EnglishMarks = new SubjectAndMarks();
        EnglishMarks.setSubject("English");
        EnglishMarks.setMarks(95);
        studentresult.add(EnglishMarks);

        SubjectAndMarks HindiMarks = new SubjectAndMarks();
        HindiMarks.setSubject("Hindi");
        HindiMarks.setMarks(70);
        studentresult.add(HindiMarks);

        SubjectAndMarks sciencemarks = new SubjectAndMarks();
        sciencemarks.setSubject("science");
        sciencemarks.setMarks(90);
        studentresult.add(sciencemarks);

        SubjectAndMarks Socialmarks = new SubjectAndMarks();
        Socialmarks.setSubject("social");
        Socialmarks.setMarks(80);
        studentresult.add(Socialmarks);

        Student student = new Student();
        student.setFirstname("sanjeev");
        student.setLastname("Gupta");
        student.setMarks(studentresult);
        student.setPercentage(90);
        student.setResult("Good");

        System.out.println("Student FirstName = "+student.getFirstname());
        System.out.println("Student LastName = "+student.getLastname());
        System.out.println("Student Percentage = "+student.getPercentage());
        System.out.println("Student result = "+student.getResult());

        for(int i=0; i<student.getMarks().size();i++)
        {
            System.out.println("Student subject = "+student.getMarks().get(i).getSubject());
            System.out.println("Student marks = "+student.getMarks().get(i).getMarks());
        }
    }
}
