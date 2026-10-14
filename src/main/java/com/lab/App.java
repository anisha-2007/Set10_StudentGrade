package com.lab;

public class App {

    public static String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100");
        }

        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else if (marks >= 50) return "E";
        else return "F";
    }

    public static void main(String[] args) {
        String studentName = "Student";
        int marks = 85;

        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade(marks));
    }
}