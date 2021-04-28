public class VarargsContext {
    public static double average(double... numbers){
     double total = 0.0;

     if(numbers.length != 1){
         for(double var: numbers)
             total += var;
     }else
         return numbers[0];

     return total/numbers.length;
    }

    public static void main(String... arguments){
        double d1 = 20.5;
        double d2 = 24.5;
        double d3 = 26.5;
        double d4 = 10.5;

        System.out.printf("d1 = %.2f%nd2 = %.2f%nd3 = %.2f%nd4 = %.2f%n", d1, d2, d3, d4);

        System.out.printf("Average of d1 is %.2f%n", average(d1));
        System.out.printf("Average of d1 and d2 is %.2f%n", average(d1, d2));
        System.out.printf("Average of d1, d2 and d3 is %.2f%n", average(d1, d2, d3));
        System.out.printf("Average of d1, d2, d3 and d4 is %.2f%n", average(d1, d2, d3, d4));
    }
}
