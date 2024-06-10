package scannerclass;

import java.util.Scanner;

public class Scanner_example2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String cdn = "yes";
		Scanner scan = new Scanner(System.in);
		while(cdn.equals("yes")){
			System.out.println("Enter the amount");
			int amount = scan.nextInt();
			System.out.println("Please enter the cash:" +" "+ amount);
			System.out.println("Do you want to continue?(yes/no)");
			
		}

		
	}

}
