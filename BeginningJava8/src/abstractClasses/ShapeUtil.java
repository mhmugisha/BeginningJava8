
//A ShapeUtil Class That Has Utility Methods to Draw 
//Any Shapes and Print Details About Them

package abstractClasses;

public class ShapeUtil {
	
	public static void drawShapes(Shape[] list) {
		for(int i = 0; i<list.length; i++) 
			list[i].draw(); //draw no matter what shape - late binding.
			
	}

	public static void printShapeDetails(Shape[] list) {
		for(int i = 0; i<list.length; i++) {
			//Get details about each shape.	
		String name = list[i].name;		//late binding
		double area = list[i].getArea();//late binding
		double perimeter = list[i].getPerimeter();//late binding
		
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Area: " + Math.round(area));
		System.out.println("Perimeter: " + Math.round(perimeter));
		}
	}
	
	
}
