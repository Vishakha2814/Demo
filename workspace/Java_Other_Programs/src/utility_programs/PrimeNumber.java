package utility_programs;
import java.util.Scanner;
//To determine number given number is prime or not....
public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		int count = 0; // division counter.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
                                                                        
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + " " + "is a prime number....!!!");
		} else {
			System.out.println(n + " " + "is not a prime number....!!!");
		}
	}

}
