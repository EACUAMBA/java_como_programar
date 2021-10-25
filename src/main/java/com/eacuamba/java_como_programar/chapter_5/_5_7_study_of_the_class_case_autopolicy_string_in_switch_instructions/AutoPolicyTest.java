package com.eacuamba.java_como_programar.chapter_5._5_7_study_of_the_class_case_autopolicy_string_in_switch_instructions;

public class AutoPolicyTest{
	public static void main(String... args){
		
		AutoPolicy autoPolicy1 = new AutoPolicy(1111, "Lamborghine Gallardo", "NJ");
		AutoPolicy autoPolicy2 = new AutoPolicy(2222, "Lamborghine Murcielago", "ME");
		
		policyInNoFaultState(autoPolicy1);
		policyInNoFaultState(autoPolicy2);
		
		
	}
	
	public static void policyInNoFaultState(AutoPolicy autoPolicy){
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s State %s %s a no-fault state%n%n"
		, autoPolicy.getAccountNumber()
		, autoPolicy.getMakeAndModel()
		, autoPolicy.getState()
		, (autoPolicy.isNoFaultState() ? "is" : "is not"));
	}
}