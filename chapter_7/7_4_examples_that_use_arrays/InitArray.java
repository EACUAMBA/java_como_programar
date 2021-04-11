public class InitArray{
	public static void main(String args[]){
		emptyArray();
		System.out.printf("%n%n");
		populatedArray();
		System.out.printf("%n%n");
populatingArray();
		
		
	}
	public static void populatingArray(){
	
		final int ARRAY_LENGTH = 10;
		int array[] = new int[ARRAY_LENGTH];
		
		for(int i = 0; i< array.length; i++)
			array[i] = 5 + 5 * i;
			
			System.out.printf("Populating Array%n%s%8s%n", "Index", "Value");
			
	
		for(int i = 0; i< array.length; i++)
			System.out.printf("%5s%8s%n", i, array[i]);
	}
	
	public static void populatedArray(){
	//Declarando um array com dados.
		int[] array = {10, 20, 30, 20, 33, 20, 40, 10, 30, 20, 30};
		
		//Imprimindo uma string inicial para a tabela.
		System.out.printf("Populated Array%n%s%8s%n", "Index", "Value");
		
		//Percorendo o array.
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5s%8s%n", i, array[i]);
		}
	}
	public static void emptyArray(){
		//Declarando o array, Sem dados.
		int[] array = new int[10];
		
		//Imprimindo uma string inicial para a tabela.
		System.out.printf("Empty Array%n%s%8s%n", "Index", "Value");
		
		//Percorendo o array.
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5s%8s%n", i, array[i]);
		}
	}
}