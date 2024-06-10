package this_keyword;

public class A {
int i = 10;
A(){
	
	System.out.println("Hello");
}
A(int x){
	this();
	System.out.println(this.i);
}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a1 = new A(100);
	}
}
