package carPassByReference;

public class CarPassByConstantReferenceValue {

	public static void test(final Car xyzCar) {

		// Can read the object referenced by xyzCar
		String model = xyzCar.model;
		System.out.println("#2.Model: " + xyzCar.model);
		
		//Can modify instance variables of object referenced by xyzCar
		xyzCar.year = 2001;
		System.out.println("#3.Modified Year: " + xyzCar.year);
		
		/* Cannot modify xzyCar. That is, xyzCar must reference the object that the actual
		parameter is referencing at the time this method is called. You cannot even set it to
		null reference. */

		//xyzCar = null; //Compile-time error - final local variable xyzCar cannot be assigned.
		//xyzCar = new Car();// Compile-time error - final local variable xyzCar cannot be assigned.
		
	}

	public static void main(String[] args) {

		// Create a car object(instance) and assign its reference to myCar.
		Car myCar = new Car();

		// Change model, year and price of Car object using myCar
		myCar.model = "Civic LX";
		myCar.year = 2010;
		myCar.price = 1600;

		System.out.println("#1.Model: " + myCar.model + ", Year: " + myCar.year + ", Price: " + myCar.price);

		// Let's invoke the test method.
		test(myCar);
	}

}
