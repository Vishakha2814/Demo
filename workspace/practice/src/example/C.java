package example;

public class C {
	 C(){
		 
		this(100);
		System.out.println("Hello");
	}
	 C(int x) {
		 System.out.println(x);
		 
	 }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		C c1 = new C(100);
		
	}

}
