package general_utility_program;
import java.util.Scanner;
public class Largest_among_n_digit {

	public static void main(String[] args) {
		int max,i,n;
		int a[];

	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n number:");
	n= sc.nextInt();
	
	a= new int[n];
	
	System.out.println("Enter the numbers:");
	
	for(i=0; i<n; i++) {
	a[i]= sc.nextInt();
	}
	
	max= max_num(a,n);
	System.out.print("The largest number is"+max);
	}
	
	static int max_num(int[]a,int n){
		int i;
		int m=0;
		for (i = 0; i < n; i++) {
			if (a[i]>m) {
				m=a[i];
			}
		}
			return m;
	}	
}

