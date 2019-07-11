package strings;

public class Palindrome {

	//Method isPalindrome
	public static void isPalindrome(String inputString) {
		//Check for null input
		if(inputString == null)
			throw new IllegalArgumentException("String can't be null");
		
		//Get length of the string
		int len = inputString.length();
		
		if(len == 0 || len == 1)
			System.out.println(inputString + " is a palindrome.");
		
		
		for(int i = 0; i<=(len-1)/2; i++) 
			
			for(int k = (len-1); k >(len-1)/2; k--)
			{
				if(inputString.charAt(i) == inputString.charAt(k))
					System.out.println(inputString + " is a palindrome.");
				k--;
						
			}
		System.out.println(inputString + " is not a palindrome.");
	}
		
	public static void main(String[] args) {
		
		Palindrome.isPalindrome("noooon");
		
	}

}
