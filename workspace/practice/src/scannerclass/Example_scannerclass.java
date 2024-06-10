package scannerclass;

import java.util.Scanner;

public class Example_scannerclass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is"+" "+name);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Your age is:"+" "+age);
		System.out.println("Enter your height:");
		float height = sc.nextFloat();
		System.out.println("Your height is:"+" "+height);
		System.out.println("Are you human?");
		boolean answer = sc.nextBoolean();
		System.out.println(answer);
	}

}
