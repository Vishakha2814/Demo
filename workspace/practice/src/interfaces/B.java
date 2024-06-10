package interfaces;
//An Interface can consist of only incomplete method
public class B implements A {
	@Override
	public void test(){
		System.out.println("class B implements interface A");
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}

}
