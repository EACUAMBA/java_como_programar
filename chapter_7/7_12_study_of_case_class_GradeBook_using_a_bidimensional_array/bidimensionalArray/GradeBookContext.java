package bidimensionalArray;

public class GradeBookContext {
    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook("AGF - Introduction to Data Cience", GradeBook.generateArray(100000, 5000));
        System.out.printf("%s%s","Welcome to grades for ", gradeBook.getCourseName());
        gradeBook.processGrades();
    }
}
