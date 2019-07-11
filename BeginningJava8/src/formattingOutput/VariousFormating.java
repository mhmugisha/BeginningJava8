package formattingOutput;

public class VariousFormating {

	public static void main(String[] args) {
		
		System.out.printf("'%s', '%5s', '%.3s'%n", "Ken","Matt", "Lola");
		System.out.printf("'%S', '%5S', '%3S'%n", "Ken","Matt", "Lola");
		System.out.printf("'%S', '%-5S', '%3S'%n", "Ken","Matt", "Lola");
		System.out.printf("%s %n", 1969);
		System.out.printf("%s %n", false);
		System.out.printf("%s %n", new Object());
		

		System.out.printf("1." + "'%d' %n", 1969);
		System.out.printf("2." + "'%6d' %n", 1969);
		System.out.printf("3." + "'%-6d' %n", 1969);
		System.out.printf("4." + "'%06d' %n", 1969);
		System.out.printf("5." + "'%(d' %n", 1969);
		System.out.printf("6." + "'%(d' %n", -1969);
		System.out.printf("7." + "'% d' %n", 1969);
		System.out.printf("8." + "'% d' %n", -1969);
		System.out.printf("9." +"'%+d' %n", 1969);
		System.out.printf("10" + "'%+d' %n", -1969);	
		
		boolean [] bArray = new boolean[3];
		
		System.out.println(bArray[0]);
	}

}
