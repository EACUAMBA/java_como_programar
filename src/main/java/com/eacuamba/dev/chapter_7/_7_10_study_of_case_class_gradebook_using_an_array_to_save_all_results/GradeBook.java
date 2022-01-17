package com.eacuamba.dev.chapter_7._7_10_study_of_case_class_gradebook_using_an_array_to_save_all_results;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void processGrades(){
        this.outputGrades();

        System.out.printf("%nThe class average is %.2f%n", this.getAverage());
        System.out.printf("The lowest grade is %d%n and the highest grade is %d%n", this.getMinimum(), this.getMaximum());

        this.outputBarChart();

    }
    public void outputBarChart(){
        int[] frequency = new int[11];

        for(int value: this.grades){
            frequency[value/10]++;
        }

        for(int i =0; i<frequency.length; i++){
            if(i == 10)
                System.out.printf("%4d:", (i*10));
            else
                System.out.printf("%4d->%4d:", (i*10), ((i*10)+9));

            for (int star = 0; star< frequency[i]; star++){
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
    }
    public void outputGrades(){
        System.out.printf("%nThe number of the student and its notes:%n");
        for (int i = 0; i < this.grades.length; i++)
            System.out.printf("Student %d : %d%n", (i+1), this.grades[i]);
    }

    public double getAverage(){
        int total=0;
        for(int value: this.grades)
            total +=value;

        return (total/this.grades.length);
    }

    public int getMaximum(){
        int maximum = this.grades[0];

        for(int value: this.grades){
            if(maximum < value)
                maximum = value;
        }
        return maximum;
    }
    public int getMinimum(){
        int minimum = this.grades[0];

        for(int value: this.grades){
            if(minimum > value)
                minimum = value;
        }

        return minimum;
    }
}
