package exceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		int z; 
		
		try 
		{
			z = x/y;
			System.out.println("z = " + z);
		}
		
		catch (ArithmeticException e) 
		{
			//String s = e.toString();
	 	System.out.println("Error: " + e);
		}
System.out.println("This executes after the exception, "
		+ "ie program does not exit when u use a try-catch block");
	
	
	}

}
