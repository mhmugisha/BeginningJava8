
//An Abstract Shape Class with One Instance Variable, 
//Two Constructors, and One Abstract Method

package abstractClasses;

public abstract class Shape {

	public String name = "Unknown name";
	
	//Default constructor
	public Shape() {
		this.name = "unknown shape";
	}
	
	//Parameterized constructor
	public Shape(String name) {
		this.name = name;
	}
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter method
	public String getName() {
		return this.name;
	}
	
	//Absract methods
	public abstract void draw();
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
