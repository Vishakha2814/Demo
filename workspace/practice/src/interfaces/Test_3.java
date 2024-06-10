package interfaces;

public class Test_3 implements Test_2{
	@Override
	public void example_1(){
		System.out.println(149990900);
	}
	@Override
	public void example_2(){
		System.out.println(56000);
	}
	public static void main(String[] args) {
		Test_3 refvar = new Test_3();
		refvar.example_1();
		refvar.example_2();
	}

}