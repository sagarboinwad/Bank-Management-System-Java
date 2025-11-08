package inheritance;

public class SavingAccount extends Account{
	
	private double interestRate;
	
	public SavingAccount(String accountHolderName, int accountNumber, double balance, double interestRate) {
		super(accountHolderName, accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		setBalance(getBalance() + interest);
		System.out.println("Interest of "+interest+ " added to your account!");
	}
	

}
