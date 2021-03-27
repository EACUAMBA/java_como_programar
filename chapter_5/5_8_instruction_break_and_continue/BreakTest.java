public class BreakTest{
	public static void main(String args[]){
		
		int count;
		
		for(count =1; count<=4; count++){
			for(int x = 1; x<=2; x++){
				if(x == 2)
				break;
				System.out.printf("Inside the for for x value is %d%n", x);
			}
			
			
			
			System.out.printf("Inside the for count value is %d%n", count);
			
		}
		
		System.out.printf("Outside the for count value is %d%n", count);
		
	}
}