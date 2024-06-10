package general_utility_program;
import java.util.Scanner;


public class Factorial{
	
	public static void main(String[] args){
		int n, fact = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact= fact*i;
		}
		System.out.println("Entered nmuber"+" "+n+" "+"is"+" "+fact);
	}
}