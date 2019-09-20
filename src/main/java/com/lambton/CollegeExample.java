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
        HindiMarks.setMarks(90);
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


        System.out.println("Student FirstName = "+student.getFirstname());
        System.out.println("Student LastName = "+student.getLastname());


        int d=0;
        int count =0;
        for(int i=0; i<student.getMarks().size();i++)
        {
            System.out.println("Student subject = "+student.getMarks().get(i).getSubject());
            System.out.println("Student marks = "+student.getMarks().get(i).getMarks());

            d=d+student.getMarks().get(i).getMarks();

            if(50>student.getMarks().get(i).getMarks())
            {
                count++;
            }
        }

            if(count >=2)
            {
                student.setResult("fail");
                System.out.println("Student "+student.getResult() );
            }
            else
            {
                student.setPercentage((d/5));
                student.setTotal(d);
                student.setResult("pass");

                System.out.println("Student total number = "+student.getTotal());
                System.out.println("Student percentage = "+student.getPercentage());
                System.out.println("Student "+student.getResult());


                if(student.getPercentage()<72 && student.getPercentage()>70)
                {
                    System.out.println("B-");
                }
                if(student.getPercentage()<76 && student.getPercentage()>76)
                {
                    System.out.println("B");
                }
                if(student.getPercentage()<87 && student.getPercentage()>80)
                {
                    System.out.println("B+");
                }
                if(student.getPercentage()<94 && student.getPercentage()>87)
                {
                    System.out.println("A");
                }
                if(student.getPercentage()<100 && student.getPercentage()>94)
                {
                    System.out.println("A+");
                }
            }
        }
}
