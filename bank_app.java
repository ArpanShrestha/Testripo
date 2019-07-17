import java.util.Scanner;
public class bank_app {
	
	public static void main(String[] args) {
		BankAccount object1= new BankAccount("Arpan","AT2401");
		object1.menuOptions();
		
	}

}

class BankAccount
{
	int balance;
	int prevTransaction;
	String custName;
	String custID;
	
	BankAccount(String cname, String cid)
	{
		custName=cname;
		custID=cid;
	}
	
	void deposit(int amount)
	{
		if(amount!=0) {
			balance=balance+amount;
			prevTransaction=amount;
		}
	}
	
	void withdraw(int amount)
	{
		balance=balance-amount;
		prevTransaction=-amount;
	}
	
	void PrevTransaction() {
		if (prevTransaction>0) {
			System.out.println("You have deposited: "+prevTransaction);
		
		}
		else if(prevTransaction<0) {
			System.out.println("You have withdraw: "+Math.abs(prevTransaction));
			
		}
		else {
			System.out.println("No transaction have been completed so far.");
			
		}
	}
	
	void menuOptions()
	{
		char option='0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome user: "+custName);
		System.out.println("Your customer id is: "+custID);
		System.out.println("\n");
		System.out.println("Input 'A' to check your current balance");
		System.out.println("Input 'B' to deposit");
		System.out.println("Input 'C' to withdraw");
		System.out.println("Input 'D' to view previous transction");
		System.out.println("Input 'E' to exit the program");
		
		do {
			System.out.println("\n");
			System.out.println("----------------------------------------");
			System.out.println("Please enter an option");
			option=scanner.next().charAt(0);
			
			System.out.println("----------------------------------------");
			System.out.println("\n");
		
			
			switch(option) {
			
			case 'A':
				System.out.println("----------------------------------------");
				System.out.println(" Your current Balance is "+balance);
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
			
			case 'B':
				System.out.println("----------------------------------------");
				System.out.println("Please enter an amount to deposit");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------------");
				System.out.println("Please enter an amount to withdraw");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------------");
				PrevTransaction();
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("----------------------------------------");
				break;
				
			default:
				System.out.println("You have entered an invalid option!! Please try again");
				break;
				
			}
			
		} while(option!='E');
		System.out.println("Thank you for running our program");
	}

	private char toUpperCase(char charAt) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
