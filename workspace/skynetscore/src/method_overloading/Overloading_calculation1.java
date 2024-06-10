package method_overloading;

public class Overloading_calculation1 {

	void sum(int a, long b){
		System.out.println(a+b);
	}
	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overloading_calculation1 ob = new Overloading_calculation1();
		ob.sum(20, 30);
		ob.sum(10, 20, 30);
	}

}
