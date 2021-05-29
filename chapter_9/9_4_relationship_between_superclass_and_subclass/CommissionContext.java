public class CommissionContext {
	public static void main(String[] args){
		CommissionEmployee edilson = new CommissionEmployee("Edilson", "Cuamba", "123456789", 10000.0, 0.20);

		System.out.printf("Full Name: %s %s%n", edilson.getFirstName(), edilson.getLastName());
		System.out.printf("Social Security Number: %s%n", edilson.getSocialSecurityNumber());
		System.out.printf("Gross Sales: %.2f%n", edilson.getGrossSales());
		System.out.printf("Commission Rate: %.2f%n", edilson.getCommissionRate());

		edilson.setGrossSales(20000.0);
		edilson.setCommissionRate(.50);

		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", edilson);
	}
}