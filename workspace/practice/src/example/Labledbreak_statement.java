package example;

public class Labledbreak_statement {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			lable: if (i<7) {
				System.out.println("inner loop"+i);
				break lable;
			}
		System.out.println("______________________>outer loop___________>"+i);
		}
	}

}
 