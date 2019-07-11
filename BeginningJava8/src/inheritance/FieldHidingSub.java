package inheritance;

public class FieldHidingSub extends FieldHidingSuper{

	//These instance variabble num and name in the subclass
	//hide the ones in the main class.

	private int num = 200;
	private String name = "Spouse";

	public void print() {
		System.out.println("In sub num: " + num);
		System.out.println("In sub name: " + name);
		System.out.println("In super num: " + super.num);
		System.out.println("In super name is: " + super.name);
	}
	
	
}
