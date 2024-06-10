package polymorphism;

public class Child1 extends Parent1{
	void test(){
		System.out.println("from child class");
	}

	public static void main(String[] args) {
		
		Child1 a1 = new Child1();
		a1.test();
		Parent1 a2 = new Parent1();
		a2.test();
		a1.test();
		a2.test();
	}

}
