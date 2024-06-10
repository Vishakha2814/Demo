package interfaces;
//In JDK 1.8 we can create complete method in interface...
//To create complete method in an interface we use default keyword as shown in below example.
 interface Complete_A {
	default void test1(){
		System.out.println(299);
	}
}
