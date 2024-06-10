package encapsulation;

//encapsulation is a process of hiding the data.....and data is nothing but the values stored in the variable.
//encapsulation refers to the bundling of the data with the method that operates on that data.
//Restricting the direct access to some of your objects component.
//publicly accessible methods are generally provided in the class so called "getters" and "setters".
//but variable inside the class are private---- to avoid direct access  of it......

public class ExampleB {

	public static void main(String[] args) {
		ExampleA  A = new ExampleA();
		A.setage(24);
		A.setname("vishakha");
		System.out.println(A.getage());
		System.out.println(A.getname());
	}

}