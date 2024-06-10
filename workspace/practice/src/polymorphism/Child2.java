package polymorphism;

public class Child2 extends Parent2 {
	public void test1(){
		System.out.println(12467);
	}
	public static void main(String[] args) {
	Child2 c2 = new Child2();
	c2.test1();
	c2.test2();
	c2.test1();
	Parent2 p2 = new Parent2();
	p2.test1();
	p2.test2();
	}

}
