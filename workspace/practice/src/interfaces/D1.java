package interfaces;
//In java, interfaces support multiple inheritance but at class level 
//multiple inheritance is not alloewed.
public class D1 implements C1{
	
	@Override
	public void test1(){
		System.out.println(100);
	}
	@Override
	public void test2(){
		System.out.println(200);
	}
	@Override
	public void test3(){
		System.out.println(300);
	}
	public static void main(String[] args) {
		D1 refvar = new D1();
		refvar.test1();
		refvar.test2();
		refvar.test3();
	}

}