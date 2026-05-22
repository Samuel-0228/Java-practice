package com.pack.studentapp.service;

import com.pack.studentapp.model.Student;

public class Gradeservice {
    public String getGrade(Student student) {
        int score = student.getscore();

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";

        }

    }
}
