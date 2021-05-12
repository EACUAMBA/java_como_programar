public class MyTimeContext {
    public static void main(String[] args){
        System.out.println("Welcome to your time app!");

        MyTime myTime = new MyTime();

        print(myTime.getPatternTime(), "Printing time without call setTime.");

        myTime.setTime(17, 53, 45);
        print(myTime.getPatternTime(), "Printing after call setTime. Using getPatternTime method.");

        print(myTime.getUniversalTime(), "Printing time using getUniversalTime method.");

        try {
            myTime.setTime(200, 300, 400);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        print(myTime.getUniversalTime(), "Printing after set values out of bound/range.");


        System.out.println("Test   " + (12%12));
        System.out.println("Test   " + (13%12));
        System.out.println("Test   " + (14%12));
        System.out.println("Test   " + (15%12));
        System.out.println("Test   " + (16%12));
        System.out.println("Test   " + (17%12));
        System.out.println("Test   " + (18%12));
        System.out.println("Test   " + (19%12));
        System.out.println("Test   " + (20%12));
        System.out.println("Test   " + (21%12));
        System.out.println("Test   " + (22%12));
        System.out.println("Test   " + (23%12));
        System.out.println("Test   " + (24%12));

    }
    public static void print(String time, String message){
        System.out.printf("%n***** %s *****%n", message);
        System.out.printf("%s", time);
        System.out.printf("%n%s%n", "End printing...");
    }
}
