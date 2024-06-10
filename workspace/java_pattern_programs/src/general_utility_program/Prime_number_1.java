package general_utility_program;
import java.util.Scanner;

public class Prime_number_1{
	public static void main(String[] args){
		int n ;
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				count++;				
			}
		}if(count==2) {
			System.out.println(n+" "+"is a prime number");
		}else{
			System.out.println(n+" "+"is n ot a prime number");
		}
	}
}
