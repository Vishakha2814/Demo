package utility_programs;

public class FibonacciSeries {
	static int i = 0, j = 1, k = 0;

	static void printfibonacci(int count) {
		if (count > 0) {
			k = i + j;
			i = j;
			j = k;
			System.out.print(" " + k);
			printfibonacci(count - 1);
		}

	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(i+" "+j);
		printfibonacci(count-2);
	}
}