package examples;

public class AcountTest {

	public static void main(String[] args) {
		
		Account ac = new Account();
		double balance = ac.getBalance();
		System.out.println("Default Balance: " + balance);
		
		ac.credit(2000);
		ac.debit(100);
		
		balance = ac.getBalance();
		System.out.println("Current Balance: " + balance);
		
		//attempting invalid amounts
		ac.credit(-200);
		ac.debit(Double.POSITIVE_INFINITY);
		
		balance = ac.getBalance();
		System.out.println("Current Balance: " + balance);
		
		//Attempting to draw more than the balance
		ac.debit(4000);
		
		double bal = ac.getBalance();
		

	}

}
