
//A Rectangle Class, which inherits from the Shape Class

package abstractClasses;

public class Rectangle extends Shape {
	
	//instance variables
	public double length;
	public double width;
	
	//parameterized constructor
	public Rectangle(double length, double width) {
		super("Rectangle");//Parameterized constructor of class Shape invoked and given "Rectangle" as parameter. 
		this.length = length;
		this.width = width;
	}
	
	
	
	@Override
	//Provide an implementation for the abstract method draw()
	//in Shape class.
	public void draw() {
		System.out.println("Drawing rectangle...");
	}
	
	@Override
	//Provide an implementation for method getArea()
	public double getArea() {
		return length*width;
	}
	
	@Override
	//provide an implementation method getPerimeter()
	public double getPerimeter() {
		return 2*(length + width);
	}

}
