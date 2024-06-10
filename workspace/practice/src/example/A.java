package example;
// Using this keyword we can call constructor
public class A {

		A(){
			this(100);// should be first statement 
			System.out.println("Hello");
		}
		A(int x){
			System.out.println(x);
		}
		public static void main(String[] args) {
			@SuppressWarnings("unused")
			A a1 = new A();	
}
}
// This keyword can be used to call the constructor only when the calling can be
// done by another constructor 
// 