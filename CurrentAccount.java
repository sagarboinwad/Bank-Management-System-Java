package inheritance;

public class CurrentAccount extends Account{
	
	private double overdraftlimit;
	
	public CurrentAccount(String accountHolderName, int accountNumber, double balance, double overdraftlimit) {
		super(accountHolderName, accountNumber, balance);
		this.overdraftlimit = overdraftlimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() + overdraftlimit >= amount) {
			setBalance( getBalance() - amount);
			System.out.println("Withdraw Ammount "+ amount +"(using overdraft )");
		}else {
			System.out.println("Overdraft Limit Exceeds!");
		}
	}
	
	
	public void displayoverdraft() {
		System.out.println("Overdraft Limit :"+ overdraftlimit);
	}

}
