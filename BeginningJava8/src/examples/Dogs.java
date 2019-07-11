package examples;

public class Dogs {
	
	static int m = 100;
	int n = 200;
	
	//Declare a static method
	/*We can refer to only static variable m in this method bse you
	 *are inside a static method */	

	static void printm() {
		System.out.println("printM() - m = " + m);	
	}

	//Declare an instance method
	/*We can refer to both static and instance variables m and n 
	 * in this method*/
	
	void printn() {
		System.out.println("printMN() - m = " + m);
		System.out.println("printMN() - n = " + n);
	}
	
	public static void main(String[] args) {
		
		Dogs poppy = new Dogs();
		
		Dogs.printm(); //invoking class method using a class name.
		Dogs.printm();//Call the class method using an instance poppy bse whatever belongs to the class also belongs to the instance.
		poppy.printn();//invoking instance(non-static)method instance/object of the class
		

	}

}
