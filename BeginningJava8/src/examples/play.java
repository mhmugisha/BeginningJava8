package examples;

public class play {
	
	public static void main(String[] name) {
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + "" + j);
				if (i == j) {
					break; // Exit the inner for loop
				}
				System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println();
		Sweetie: // Defines a label named outer
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + "" + j);
				if (i == 2 && j == 2) {
					break Sweetie; // Exit the outer for loop
				}
				System.out.print("\t");
			}
			System.out.println();
		} // The Sweetie label ends here

		System.out.println();
		System.out.println();

		blockLabel: {
			int i = 5;
			if (i == 5) {
				System.out.println("Smily");
				break blockLabel; // Exits the block
			}
			if (i == 10) {
				System.out.println("i is not five");
			}
		}

		outer: // The label "outer" starts here
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + "" + j);
				System.out.print("\t");
				if (i == j) {
					System.out.println(); // Print a new line
					continue outer; // Continue the outer loop
				}
			}
		}
		printPoem();
		printPoem(3);
		System.out.println(add(12,30));
	}

	static void printPoem() {
		System.out.println("Strange fits of passion have I known:");
		System.out.println("And I will dare to tell,");
		System.out.println("But in the lover's ear alone,");
		System.out.println("What once to me befell.");
	}

	static void printPoem(int stanzaNumber) {
		if (stanzaNumber < 1 || stanzaNumber > 2) {
			System.out.println("Cannot print stanza #" + stanzaNumber);
			return; // End the method call
		}
		if (stanzaNumber == 1) {
			System.out.println("Strange fits of passion have I known:");
			System.out.println("And I will dare to tell,");
			System.out.println("But in the lover's ear alone,");
			System.out.println("What once to me befell.");
		} else if (stanzaNumber == 2) {
			System.out.println("When she I loved looked every day");
			System.out.println("Fresh as a rose in June,");
			System.out.println("I to her cottage bent my way,");
			System.out.println("Beneath an evening-moon.");
		}
		
			
		}
	static int add(int n, int m) {
		int sum = n + m;
		return sum;
	}
}
