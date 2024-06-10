package example;

public class B {
		// You can not make 'this' keyword as 2nd statement inside another constructor 
		// while making a constructor call hence the bwlow program throughs an error 
		
		B(){
			this(100);// constructor call must be the first statement in a constructor.
			System.out.println("Hello");
		}
		B(int x){
			System.out.println(x);
			}
		@SuppressWarnings("unused")
		public static void main(String[] args) {
			B b1 = new B();// The value of a local variable b1 is not used 
		}

}
