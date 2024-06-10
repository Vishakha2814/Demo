package class_object;

public class Static_nonstatic {
	int i = 100;// Nonstatic variable in which static keyword is not used.
	//Nonstaic variable is specific to that instance of class .
	
	static int j = 90;//static variable in which static keyword is used.
	//Static varaible is like global variable it is available to all method 
	
	public static void main(String[] args) {
		Static_nonstatic s1 = new Static_nonstatic();
		
		System.out.println(s1.i);// Nonstatic variable is acccessed by using the reference variable.
		//every time we create object to access the nonstaic variable ...nonstatic variable is loaded into that object.
		System.out.println(Static_nonstatic.j);// Static variable is accessed by using the classname.for that we need not to create object for this.. 
	}

}
