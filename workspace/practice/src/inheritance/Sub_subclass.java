package inheritance;

public class Sub_subclass extends Sub_class {
	 void test3(){
	System.out.println("from Sub_subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_subclass obj = new Sub_subclass();
		obj.test1();
		obj.test2(30,70);
		obj.test3();
		
	}

}
