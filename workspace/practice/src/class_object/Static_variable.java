package class_object;

public class Static_variable {
static int a = 100; 
	public static void main(String[] args) {
		System.out.println(Static_variable.a);
		//To access static variable we need not to create any object they access directly with the same name ...
		//And here we can see that , static variable value can be changed.
		Static_variable.a = 2484;
		System.out.println(Static_variable.a);
	}

}
