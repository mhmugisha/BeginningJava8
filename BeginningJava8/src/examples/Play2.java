package examples;

public class Play2 {

	
	
	//Varags (Variable arguments) method
	public static int max(int...num) {
		
		int max = 0;
		for(int i = 0; i < num.length; i++)
			if(num[i] > max)
				max = num[i];
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Max(46,84,124) is: " + max(46,84,124));
		System.out.println("Byte min: " + Byte.MIN_VALUE);
		System.out.println("Byte max: " + Byte.MAX_VALUE);
		System.out.println("Integer min: " + Integer.MIN_VALUE);
		System.out.println("Integer max: " + Integer.MAX_VALUE);
		System.out.println("Float min: " + Float.MIN_VALUE);
		System.out.println("Float max: " + Float.MAX_VALUE);
		System.out.println("Long min: " + Long.MIN_VALUE);
		System.out.println("Long max: " + Long.MAX_VALUE);
		
		System.out.println("Long size: " + Long.SIZE);
		
		
		
		}
	
	Object obj = new Object();
	//obj1 = new Play2();

	}


