package arrays;

public class CopyingArrays {

	
	public static void main(String[] args) {
		
		int [] data = {9,2,3,4,5};
		int [] edata = expandArray(data, 7);
		
		for(int i = 0; i<7; i++)
		
		System.out.println(edata[i]);
	}
	
	public static int[] expandArray(int[] oldArray, int newLength) {
		int originalLength = oldArray.length;
		int[] newArray = new int[newLength];
		int elementsToCopy = 0;
		if (originalLength > newLength) {
		elementsToCopy = newLength;
		}
		else {
		elementsToCopy = originalLength;
		}
		for (int i = 0; i < elementsToCopy; i++) {
		newArray[i] = oldArray[i];
		}
		return newArray;
		}
	
}
