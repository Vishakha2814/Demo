package arrays;

public class Array6 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};// array declaration.
		Array6 a1 = new Array6(); // object creation of class Array6
		a1.test(arr); // test method called in main method.
	}
	public void test(int[] x){
		for (int i : x) {
			System.out.print(i+" ");
		}
	}
}