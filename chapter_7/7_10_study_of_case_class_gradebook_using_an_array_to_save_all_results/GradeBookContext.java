import java.security.SecureRandom;

public class GradeBookContext {
    private static final SecureRandom sr = new SecureRandom();

    public static void main(String... args){
        GradeBook gradeBook = new GradeBook("AAC - Introducing to Machine Learning!", createArray());

        System.out.printf("Welcome to grade book for %s%n%n", gradeBook.getCourseName());
        gradeBook.processGrades();
    }

    public static int[] createArray() {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = sr.nextInt(100);
        }
        return array;
    }
}
