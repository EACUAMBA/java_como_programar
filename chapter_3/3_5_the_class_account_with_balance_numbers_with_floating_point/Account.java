


public class Account{
	private String name;
	private double balance;
	
	public Account(String name, double initialBalance){
		this.name = name;
		
		if(initialBalance>0.0){
			this.balance = initialBalance;
		}
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void deposit(double depositAmount){
	
		if(depositAmount>0.0){
			this.balance = this.balance + depositAmount;
		}
	}
	
	public double getBalance(){
		return this.balance;
	}
}