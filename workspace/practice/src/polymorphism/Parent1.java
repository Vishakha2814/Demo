package polymorphism;
//Developing a feature such that it can take more than one form is called as polymorphism.
//or we can say like ability of an object that can take more than one form is called as polymorphism.

public class Parent1 {
	void test(){
		System.out.println("from parent class");
	}

}

//There are two forms of polymorphism.
//1) overriding 
//2) overloading

//we are studying polymorphism which can be achieved through one of its type is overriding.
//In overriding we use concept of inheritance...
// Here, we invite the method of parent class in child class.
//and then we modify the logic of inherited method in child class by once again creating method with the same name in child class.