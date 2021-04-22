public class EnhancedForContext {
    public static void main(String... args){
        int[] salaries = {100, 30, 20, 19, 20, 18};
        int total = 0;


        for(int i : salaries)
        total += i;

        System.out.printf("%s%d", "The total result of the sum is ", total);
    }
}
