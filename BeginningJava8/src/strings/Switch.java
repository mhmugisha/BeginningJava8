package strings;

public class Switch {

	public static void main(String[] args) {
		String str = "ON";
		switch(str) {
		case "ON":
			System.out.println("Not Sure it will come on!");
			break;
		case "Off":
			System.out.println("Will not turn on!");
			break;
		default:
			System.out.println("Invalid input");

		}

	}
}
