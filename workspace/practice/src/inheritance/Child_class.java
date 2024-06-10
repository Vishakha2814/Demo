package inheritance;

public class Child_class extends Parent_class {
	@Override
	public void test1(){
		System.out.println(27657850);
	}
	public static void main(String[] arg){
		
		Child_class obj = new Child_class();
		System.out.println(obj.i);
		System.out.println(obj.v);

		obj.test1();
	}
}
