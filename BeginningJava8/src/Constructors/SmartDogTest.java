package Constructors;

public class SmartDogTest {

	public static void main(String[] args) {
		// Create two SmartDog objects.
		
		SmartDog sd1 = new SmartDog();
		SmartDog sd2 = new SmartDog("Nova", 219.2);
		
		//Print details about the two dogs
		sd1.printDetails();
		sd2.printDetails();
		
		//Make them bark
		sd1.bark();
		sd2.bark();
		
		//Change name and price of Unknown dog.
		sd1.setName("Opal");
		sd1.setPrice(300);
		
		//Print details again;
		sd1.printDetails();
		sd2.printDetails();
		
		//Make them back one more time.
		sd1.bark();
		sd2.bark();
		
		System.out.println("Name of 1st dog: " + sd1.getName() + ".");
		System.out.println("Name of 2nd dog: " + sd2.getName() + ".");
		
	}

}
