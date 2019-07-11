
//A Circle Class, Which Inherits from Shape Class
//By implementing we mean that we provide the body 
//of the method to the abstract classes in class Shape.

package abstractClasses;

public class Circle extends Shape {
	public double radius;
	
	//default constructor
	public Circle (double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	//provide implementation for draw() in class Shape
	public void draw() {
		System.out.println("Drawing circle...");
		
	}

	@Override
	//Overides getArea() in Shape - implements getArea()
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	//Overrides getPerimeter() in Shape - implements  
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
}
