package examples;

public class PersonTest {

	public static void main(String[] args) {
		Person john = new Person("John Jacobs", "Male");
		String initialName = john.getName();
		john.setName("Billy Gibbs");
		String changedName = john.getName();
		
		System.out.println(initialName);
		System.out.println("and new name:");
		System.out.println(changedName);
		
	}

	
		
	
	
	
}
