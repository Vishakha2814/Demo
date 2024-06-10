package interfaces;

public class Lambda_B {
//
//	public static void main(String[] args) {
//		Lambda_A a1 = ()->{
//			System.out.println(1000);
//			System.out.println(2000);
//		};
//		
//		a1.lambda();
//	}
	
//	public static void main(String[] args) {
//		Lambda_A a1 = ()-> System.out.println(4000);
//		a1.lambda();
//	}

	public static void main(String[] args) {
		 Lambda_A a1 = (int x)-> System.out.println(x);
		 a1.lambda(24324);
	}
}
