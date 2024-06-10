package utility_programs;

import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		int n ,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		n = scan.nextInt();
		for(int i=1 ; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("factorial of"+ " "+n+" " + "is" + " "+fact);
	}
}