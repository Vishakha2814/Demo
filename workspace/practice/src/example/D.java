package example;

public class D {
	D(){
		System.out.println("Hello");
	}
	D(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		D d1 = new D(100);
	}

}
