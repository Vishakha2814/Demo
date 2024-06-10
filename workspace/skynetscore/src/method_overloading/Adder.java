package method_overloading;
//In this example we have created two methods add and one main method add method takes three arguments
//first add method take two arguments and second 

public class Adder {

//In this example we are creating static methods so, we dont need to create instance for calling methods.
	
	static int add1(int a, int b){
		return a+b;
	}
	static int add1(int a, int b, int c){
		return a+b+c;
	}
	static int add2(int a, int b){
		return a+b;
	}
	static double add2(double a, double b, double c){
		return a+b+c;
	}
//	static int add3(int a, int b){
//		return a+b;
//	}
//	static double add3(int a, int b){
//		return a+b;
//	}
}
