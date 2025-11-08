package inheritance;

public class Account {
	
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	
	public Account(String accountHolderName, int accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println(amount+ " Deposited Successfully");
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount >= 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println(amount+" Withdrawn Successfully");
		}else {
			System.out.println("Insuficient Balance!");
		}
	}
	
	
	public void display() {
		System.out.println("ACCOUNT HOLDER NAME:"+ accountHolderName);
		System.out.println("ACCOUNT NUMBER :"+ accountNumber);
		System.out.println("Current Balance :"+ balance);
	}

}
