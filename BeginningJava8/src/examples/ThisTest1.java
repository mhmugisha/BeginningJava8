//Example from Beginning Java 8 page 207.
// Note that there are two nums.

package examples;

public class ThisTest1 {

	int num = 1982;// An instance variable num.

	void printNum(int num) // Parameter variable num.
	{
		System.out.println("Parameter num: " + num);
		System.out.println("Instance Variable num: " + this.num);
	}

	// Create an object/instance upon which to invoke printNum.
	public static void main(String[] args) 
	{
		
		ThisTest1 instance = new ThisTest1();
		instance.num = 1800;
		instance.printNum(1969);
		
		
		ThisTest1 insta = new ThisTest1();
		insta.printNum(3000);
	}

}
