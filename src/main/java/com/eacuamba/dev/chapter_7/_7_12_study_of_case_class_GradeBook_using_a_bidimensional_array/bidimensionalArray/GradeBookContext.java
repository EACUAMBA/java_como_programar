package com.eacuamba.dev.chapter_7._7_12_study_of_case_class_GradeBook_using_a_bidimensional_array.bidimensionalArray;

public class GradeBookContext {
    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook("AGF - Introduction to Data Cience", GradeBook.generateArray(100000, 5000));
        System.out.printf("%s%s","Welcome to grades for ", gradeBook.getCourseName());
        gradeBook.processGrades();
    }
}
