package chapter_9._9_4_relationship_between_superclass_and_subclass;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/29/2021
 */
public class BasePlusCommissionEmployeeContext {
    public static void main(String[] args) {
        BasePlusCommissionEmployee edilson = new BasePlusCommissionEmployee("Joe", "Cuamba", "123456789", 1000.0, 0.20, 20000.0);

        System.out.printf("Full Name: %s %s%n", edilson.getFirstName(), edilson.getLastName());
        System.out.printf("Social Security Number: %s%n", edilson.getSocialSecurityNumber());
        System.out.printf("Gross Sales: %.2f%n", edilson.getGrossSales());
        System.out.printf("Commission Rate: %.2f%n", edilson.getCommissionRate());
        System.out.printf("Base Salary: %.2f%n", edilson.getBaseSalary());

        edilson.setGrossSales(20000.0);
        edilson.setCommissionRate(.50);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", edilson.toString());

        System.out.println(edilson.hashCode());
    }

}
