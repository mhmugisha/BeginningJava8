//Listing 6-19 Page 218 Beginning Java 8.

package examples;

public class Account {
	
	
	private double balance;
	
	//Method to return the balance of this account
	public double getBalance() {
		return this.balance; // Recall this is initialised to 0 by default
	}
	
	//Method to restrict a/c credit amounts
	public int credit(double amount) 
	{
		if(amount < 0.0 ||Double.isNaN(amount)||Double.isInfinite(amount))
		{
			System.out.println("Invalid amount: " + amount);
		return -1;
		}
		
	//Actual crediting the amount
	
		System.out.println("Crediting amount: " + amount);
		this.balance = this.balance + amount;
		return 1;
	}
		
	
	//Method to restrict debit amounts
	public int debit(double amount) {
		if(amount < 0.0 ||Double.isNaN(amount)||Double.isInfinite(amount))
		{
			System.out.println("Invalid amount: " + amount);
		return -1;
		}
		
		//Make sure can't debit more than the balance
		if(this.balance < amount)
		{
			System.out.println("Insufficient funds. Debit attempted: " + amount);
			System.out.println("You have only: " + this.balance);
		return -1;
		}	
		//debiting the amount
		System.out.println("Debiting amount: " + amount);
		this.balance = this.balance - amount;
		return 1;
	}

}
