package chapter_8._8_8_composition.composition;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/11/2021
 */
public class CompositionContext {
    public static void main(String[] args){

        try{
            Employee employee = new Employee(
                    "Edilson",
                    "Cuamba",
                    new Date(20, 3, 2021),
                    new Date(27, 10, 1999));
            System.out.println(employee.toString());
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
