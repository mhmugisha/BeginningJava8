package Constructors;

public class SmartDog {
	
	private String name;
	private double price;
	
	//Constructor without parameters
	public SmartDog() {
		//initialize name to "unknown" and price to 0.0		
		this.name = "Unknown";
		this.price = 0.0;
		//note that "this" is not necessary here since there is no 
		//variable here hiding name and/or price. 
		
		System.out.println("Using SmartDog() Constructor.");
	}
	
	//Constructor with parameters
	public SmartDog(String name, double price) { 
		// Initialize name and price instance variables
		// with the name and price parameters
		
		this.name = name;
		this.price = price;
		
		//Note that "this" is needed here bse the variables declared
		//in this constructor hide the instance variables.
		
		System.out.println("Using SmartDog(String, double) Constructor.");
		
	}

	//Method bark
	public void bark () {
		System.out.println(name + " is barking.");
	}
	
	//Name setter method.
	public void setName(String name) {
		this.name = name;
	}
	
	//Name getter method.
	public String getName() {
		return this.name;
	}

	//Price setter method.
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Price getter method.
	public double getPrice() {
		return this.price;
	}
	
	public void printDetails() {
		System.out.print("Name: " + this.name);
		if (price > 0.0)
			System.out.println(", Price: " + this.price);
		else
			System.out.println(", Price: Free");
		
	}
}
