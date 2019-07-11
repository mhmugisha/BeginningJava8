package carPassByReference;

public class CarPassByReferenceValue {

	//Method to manipulate car objects
	public static void test(Car anyCar) {
		
		System.out.println("#2.Model: " + anyCar.model +
							", Year: " + anyCar.year + 
							", Price: " + anyCar.price);
		
		//Let’s make anyCar refer to a new Car object
		//Note that this will output the initial instance variable values for any car object in class Car.	
		anyCar = new Car();
		System.out.println("#3.Model: " + anyCar.model +
				",  Year: " + anyCar.year + 
				", Price: " + anyCar.price);
	}
	
	
	
	public static void main(String[] args) {
		//Create a car object(instance) and assign its reference to myCar.
		Car myCar = new Car();
		
		//Change model, year and price of Car object using myCar
		myCar.model = "Civic LX";
		myCar.year = 2010;
		myCar.price = 1600;
		
		System.out.println("#1.Model: " + myCar.model + 
							", Year: " + myCar.year + 
							", Price: " + myCar.price);

		//Let's invoke the test method.
		test(myCar);
		
		System.out.println("#4.Model: " + myCar.model +
				", Year: " + myCar.year +
				", Price: " + myCar.price);
		
	}

}
