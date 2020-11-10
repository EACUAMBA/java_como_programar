
public class StudentTest{
	public static void main(String... args){
		
		Student edilson = new Student("Edilson Alexandre Cuamba", 90.0);
		Student eliadino = new Student("Eliadino Zamori Briconsto", 50.0);
		
		System.out.printf("%s's letter grade is %s%n", edilson.getName(), edilson.getLetterGrade());
		System.out.printf("%s's letter grade is %s%n", eliadino.getName(), eliadino.getLetterGrade());
		
	}
}