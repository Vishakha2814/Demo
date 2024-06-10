package scannerclass;

import java.util.Scanner;

public class Scanner_example1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")//This type of annotation allows the java programmer to disable compilation warnings for 
		//certain part of program(type,field,method,parameter,constructor and local variable)
		//If we don't want to fix the warning, then we can suppress it with the @SuppressWarnings annotation.
		//This annotation allows us to say which kinds of warnings to ignore. 
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the pin number");
			int pinNumber = scan.nextInt();
			System.out.println(pinNumber);
		if (pinNumber == 1234) {
			System.out.println("Welcome");
			break;
		}else{
			System.out.println("Invalid pin number");
			if (i == 2) {
				System.out.println("card is blocked");
			}
		}
		}
		
	}

}
