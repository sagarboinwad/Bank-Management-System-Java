package inheritance;
import java.util.Scanner;
import java.util.ArrayList;

public class BankExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> account = new ArrayList<>();
		
		
		int choice;
		do {
			
			System.out.println("============|| BANK MANAGEMENT SYSTEM ||============");
			System.out.println("1. Create Saving Account");
			System.out.println("2. Create Current Account");
			System.out.println("3. Deposite Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Add Interest (Savings Only)");
			System.out.println("6. Show Account Details");
			System.out.println("7. Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter Account Holder Name :");
					String name = sc.nextLine();
					
					
					System.out.println("Enter Account Number :");
					int num = sc.nextInt();
					
					System.out.println("Enter Initial Balance :");
					double sbalance = sc.nextDouble();
					
					System.out.println("Enter Interest Rate(100%) :");
					double sinterest = sc.nextDouble();
					
					account.add(new SavingAccount(name, num, sbalance, sinterest));
					System.out.println("Saving Account Created Successfully!");
				    for(Account acc : account) {
				    	acc.display();
				    }
					break;
					
				case 2:
					sc.nextLine();
					System.out.println("Enter Account Holder Name :");
					String cname = sc.nextLine();
					
					
					System.out.println("Enter Account Number :");
					int cnum = sc.nextInt();
					
					System.out.println("Enter Initial Balance :");
					double cbalance = sc.nextDouble();
					
					System.out.println("Enter Overdraft Limit :");
					double coverdraft = sc.nextDouble();
					
					account.add(new CurrentAccount(cname, cnum, cbalance, coverdraft));
					System.out.println("Current Account Created Successfully!");
					for(Account acc : account) {
						acc.display();
					}
					break;
					
				case 3:
					System.out.println("Enter the Account Number :");
					int accountnum = sc.nextInt();
					boolean found = false;
					
					
					for(Account acc : account) {
						if(acc.getAccountNumber() == accountnum) {
							System.out.println("Enter Deposite Amount :");
							double depamount = sc.nextDouble();
							acc.deposite(depamount);
														
							found = true;
							break;
							
						}
					}
					if(!found) {
						System.out.println("Invalid Account Number!");
					}
				    break;
					
				case 4:
					System.out.println("Enter Account Number :");
					int withdrawnum = sc.nextInt();
					boolean get = false;
					
					for(Account acc : account) {
						if(acc.getAccountNumber() == withdrawnum) {
							System.out.println("Enter Withdraw Amount :");
							double withdrawamount = sc.nextDouble();
							acc.withdraw(withdrawamount);
							
						    get = true;
						    break;
						}
					}
					if(!get) {
						System.out.println("Invalid Account Number!");
					}
					break;
					
				case 5:
					System.out.println("Enter the Account Number :");
					int accnumber = sc.nextInt();
					boolean foundInterest = false;
					
					for(Account acc : account) {
						if(acc.getAccountNumber() == accnumber) {
							if(acc instanceof SavingAccount) {
								((SavingAccount) acc).addInterest();
								foundInterest = true;
								break;
							}
							
						}
					}
					if(!foundInterest) {
						System.out.println("Invalid Account Number!");
					}
					break;	
					
					
				
					
				case 6:
				    System.out.println("1. Display All Accounts");
				    System.out.println("2. Display Only Saving Accounts");
				    System.out.println("3. Display Only Current Accounts");
				    System.out.print("Enter Your Choice: ");
				    int DisChoice = sc.nextInt();

				    if (account.isEmpty()) {
				        System.out.println("No accounts found!");
				        break;
				    }

				    boolean disfound = false;

				    if (DisChoice == 1) {
				        for (Account acc : account) {
				            acc.display();
				            disfound = true;
				        }
				    } else if (DisChoice == 2) {
				        for (Account acc : account) {
				            if (acc instanceof SavingAccount) {
				                acc.display();
				                disfound = true;
				            }
				        }
				        if (!disfound) {
				            System.out.println("Create Saving Account First!");
				        }
				    } else if (DisChoice == 3) {
				        for (Account acc : account) {
				            if (acc instanceof CurrentAccount) {
				                acc.display();
				                disfound = true;
				            }
				        }
				        if (!disfound) {
				            System.out.println("Create Current Account First!");
				        }
				    } else {
				        System.out.println("Invalid Choice!");
				    }
				    break;

					
				case 7:
					System.out.println("Thank You For Using Bank Management System");
					break;
					
				default :
					System.out.println("Invalid Choice, please try again!");
						
		
					
			
		   }
		}while(choice != 7);
		
		sc.close();
	}
}


