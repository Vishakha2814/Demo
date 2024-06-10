package general_utility_program;
import java.util.Scanner;

public class Numberisevenorodd{
	public static void main(String args[]){
		
		int x;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number:");
		 x = sc.nextInt();
		 
		 if (x%2 == 0) {
			System.out.println("Entered number is even.");
		}else{
			System.out.println("Entered number is odd.");
		}
	}
}
