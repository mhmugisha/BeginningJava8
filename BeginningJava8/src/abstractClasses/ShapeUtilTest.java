package abstractClasses;

public class ShapeUtilTest {

	public static void main(String[] args) {
		// Create some shapes, draw, and print their details
		
		Shape[] shapeList = new Shape[2];
		shapeList[0] = new Rectangle(2.0, 4.0);//upcasting
		shapeList[1] = new Circle(5.0);		   //upcasting
		
		//Draw the shapes:
		ShapeUtil.drawShapes(shapeList);
		
		//Print the shapes:
		ShapeUtil.printShapeDetails(shapeList);
		
	}

}
