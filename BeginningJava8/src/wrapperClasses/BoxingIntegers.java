package wrapperClasses;

public class BoxingIntegers {

	public static Integer add(Integer a, Integer b) {
		
		//unbox Integers a and b to int(From wrapper to primitive)
		int aValue = a.intValue();
		int bValue = b.intValue();
		int resultValue = aValue +bValue;
		
		//Box/wrap resultValue
		Integer result = Integer.valueOf(resultValue);
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int iValue = 200;
		int jValue = 300;
		int kValue; // Will hold result as int
		
		//Box iValue and jValue into Integer objects
		Integer i = Integer.valueOf(iValue);
		Integer j = Integer.valueOf(jValue);
		
		//Store result of method add in Integer k.
		Integer k = BoxingIntegers.add(i,j);
		
		//Unbox/Unwrap Integer k object's int value into kValue int variable:
		kValue = k.intValue();
		
		//Display result using int values:
		System.out.println(iValue + " + " + jValue + " = " + kValue);
	}

}
