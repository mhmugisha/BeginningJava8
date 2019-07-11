package examples;

public class AccessLevelTest1 {

	public static void main(String[] args) {

		AccessLevel al = new AccessLevel();
		
	  //int a = al.v1; - compile -time error bse v1 is private in AccessLevel class
		int b = al.v2;
		int c = al.v3;
		int d = al.v4;
		System.out.println("b = " + b + ", c = " + c + ", d = " + d);
		System.out.println();
		
	  //invoke methods of AccessLevel class on object al
	  //al.method1(); - compile - time error bse method1 is private in AccessLevel Class
		al.method2();
		al.method3();
		al.method4();
		
	  //Modify the values of the instance variables
		al.v2 = 20;
		al.v3 = 30;
		al.v4 = 40;
		 
		System.out.println("**********************************");
		System.out.println("\nAfter modifying v2, v3 and v4");
		System.out.println();
		
	  //Invoke the methods again
		al.method2();
		al.method3();
		al.method4();
		
	}

}
