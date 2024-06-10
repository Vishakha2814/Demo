package utility_programs;

import java.util.Scanner;

public class Even_odd {
	static int n;

	public static void main(String[] args) {
		System.out.println("enter the integer number");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	}

}