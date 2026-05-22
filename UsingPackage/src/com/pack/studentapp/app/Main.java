package com.pack.studentapp.app;

import com.pack.studentapp.model.Student;
import com.pack.studentapp.service.Gradeservice;
import com.pack.studentapp.util.InputUtil;

public class Main {
    public static void main(String[] args) {
        String name = InputUtil.getString("Enter student name: ");
        int score = InputUtil.getInt("Enter student score: ");

        Student student = new Student(name, score);
        String grade = new Gradeservice().getGrade(student);

        System.out.println("Student: " + student.getname());
        System.out.println("Score: " + student.getscore());
        System.out.println("Grade: " + grade);
    }

}
