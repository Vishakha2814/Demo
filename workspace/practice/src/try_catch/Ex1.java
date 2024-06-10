package try_catch;
// To handle the exception we use try catch block 
// If any line of code in try block will create an exception then,
// try catch block will create an object of exception and that object address will be given to catch block .
// catch block will now supress the exception. 
public class Ex1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			int x = 100; 
			int y = 0;
			int z = x/y;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		System.out.println("world");
	}

}