public class Sum{
	public static void main(String args[]){
		
		int total = 0;
		
		for(int counter = 2; counter <=20; counter += 2){
			total +=counter;
		}
		
		System.out.printf("Sum is %d%n", total);
		
	}
}