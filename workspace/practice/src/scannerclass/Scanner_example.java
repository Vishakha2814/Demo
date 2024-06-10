package scannerclass;

import java.util.Scanner;

public class Scanner_example {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Describe the following code!!");
		String desc = sc.nextLine();
		System.out.println(desc);
	}

}
