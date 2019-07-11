package examples;

public class AccessLevel {

	    private int v1 = 100;
				int v2 = 200;
	  protected int v3 = 300;
	     public int v4 = 400;
	
	private void method1() 
		{
		 System.out.println("Inside method1:");
		 System.out.println("v1 = " + v1 + ", v2 = " + v2 +
				 ", v3 = " + v3 + ", v4 = " + v4);
		}
	
	void method2() 
		{
		System.out.println("Inside method2: ");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 +
					", v3 = " + ", v4 =  " + v4);
		}
	
	protected void method3() 
		{
		System.out.println("Inside method3");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 +
					", v3 = " + ", v4 =  " + v4);
		}
	
	public void method4() 
		{
		System.out.println("Inside method4");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 +
				", v3 = " + ", v4 =  " + v4);
		}

}
