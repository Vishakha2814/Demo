package myproject;

import javax.print.attribute.standard.RequestingUserName;

class SwappingPrimitive{
static int x;
static int y;
private int b;
private int a;
	int swapNumbers()  {  
			this.b = b;
			this.a = a;
			//swapping logic      
			a = a + b;
			b = a - b;
			a = a - b;  
			//prints the result  
			System.out.println("After swapping: a = " + a + ", b = " + b);
			return a + b;  
			
	}  
	
	public static void main (String[] args)  {  
			SwappingPrimitive obj = new SwappingPrimitive();
			obj.swapNumbers();
			//int x = 12, y = 18;  
			System.out.println("Before swapping, values of x and y are: "+ a + ", " + b);  
			//function calling  
			swapNumbers(x, y);  
	}  
	
}
