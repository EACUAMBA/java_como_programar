import java.security.SecureRandom;

public class RollDie{
	public static void main(String... args){
		
		SecureRandom secureRandom = new SecureRandom();
		
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		for(long i=1; i<=60000000; i++){
			
			int face = 1 + secureRandom.nextInt(6);
			
			switch(face){
				case 1: ++frequency1; break;
				case 2: ++frequency2; break;
				case 3: ++frequency3; break;
				case 4: ++frequency4; break;
				case 5: ++frequency5; break;
				case 6: ++frequency6; break;
			}
			
		}
		
		System.out.printf("%s %n %d %n %d %n %d %n %d %n %d %n %d", "List of frequencies", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
		
	}
}