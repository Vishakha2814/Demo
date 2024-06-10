package interfaces;

public class ClassB implements InterfaceA {
	@Override
	public void test1(){
		System.out.println("from test 1");
	}
	public void test2(){
		System.out.println("from test 2");
	}
	public static void main(String[] args) {
		ClassB b1 = new ClassB();
		b1.test1();
		b1.test2();
	}

}
