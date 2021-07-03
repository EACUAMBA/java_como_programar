package chapter_10._10_5_study_of_case_system_of_payment_paper_using_polimorphism.payment_paper;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s%n%s %s","Nome:", this.getFirstName(), this.getLastName(), "Social Security Number:", this.getSocialSecurityNumber());
    }
    public abstract double earnings();
}
