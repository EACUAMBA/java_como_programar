package com.eacuamba.java_como_programar.chapter_7._7_12_study_of_case_class_GradeBook_using_a_bidimensional_array.bidimensionalArray;

import java.security.SecureRandom;

public class GradeBook {
    private static SecureRandom sr = new SecureRandom();

    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void processGrades(){
        this.outputGrades();

        System.out.printf("%s%3d%n","A nota minima foi ", this.getMinimum());
        System.out.printf("%s%3d%n","A nota maxima foi ", this.getMaximum());

        this.outputBarChart();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getMaximum() {
        int maximum = 0;
        for (int[] student : this.grades) {
            for (int grade : student)
                if (maximum < grade) maximum = grade;
        }
        return maximum;
    }

    public int getMinimum() {
        int minimum = 0;
        for (int[] student : this.grades) {
            for (int grade : student)
                if (minimum > grade) minimum = grade;
        }
        return minimum;
    }

    public int getAverage(int[] setOfGrades) {
        int totalSumOfGrades = 0;
        for (int grade : setOfGrades) {
            totalSumOfGrades += grade;
        }
        return totalSumOfGrades / setOfGrades.length;
    }

    public void outputBarChart() {
        System.out.println("Printing bar chart:");
        System.out.printf("%9s%n", "Interval");

        int[] frequencies = new int[11];

        for (int[] grades : this.grades)
            for (int grade : grades)
                frequencies[grade / 10]++;

        for (int i = 0; i < frequencies.length; i++) {

            if (i == 10)
                System.out.printf("%9s", ""+(i*10));
             else
                System.out.printf("%3s%02d->%02d", " ", (i*10), (i*10+9));

            for (int star =1; star<=frequencies[i]; star++)
                System.out.printf(" %s ", "*");
            System.out.println();
        }

    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.printf("%15s", " ");
        for (int i = 0; i < this.grades[0].length; i++)
            System.out.printf("%10s", "Teste " + (i + 1));

        System.out.println("Media");

        for (int student = 0; student < this.grades.length; student++) {
            System.out.printf("%15s ", "Aluno " + (student + 1) + ":");

            for (int grade : this.grades[student]) {
                System.out.printf("%10d", grade);
            }
            System.out.printf("%10d%n", this.getAverage(this.grades[student]));
        }
        System.out.println();
    }

    public static int[][] generateArray(int numberOfStudents, int numberOfTests) {
        int[][] grades = new int[numberOfStudents][numberOfTests];

        for (int student = 0; student < grades.length; student++) {
            for (int grade = 0; grade < grades[student].length; grade++) {
                grades[student][grade] = sr.nextInt(101);
            }
        }
        return grades;
    }
}
