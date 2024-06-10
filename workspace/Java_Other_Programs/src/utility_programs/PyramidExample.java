package utility_programs;

public class PyramidExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int j = 5; i<=j; j--){
				System.out.print("  *");
			}
			System.out.println();
		}
	}

}
