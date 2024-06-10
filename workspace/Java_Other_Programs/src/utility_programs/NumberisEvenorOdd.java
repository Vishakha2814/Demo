package utility_programs;
//check whether Number is even or odd
import java.util.Scanner;
class NumberisEvenorOdd {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number:");
		x=sc.nextInt();
		if (x%2==0) {
			System.out.println("Entered Number is Even");
		} else {
			System.out.println("Entered Number is Odd");
		}
	}

}
