package javaprograms;
import java.util.Scanner;

public class Student{
	private int rollno;
	private String name;
	private int age;
	private void SetData(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public void GetData(){
		System.out.println("Displaying runtime assiged value");
		System.out.println(rollno+" "+name+" "+age);
	}
	@SuppressWarnings("resource")
	public void showdata(){
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter rollno: ");
	    rollno = sc.nextInt();
	    System.out.print("Enter name: ");
	    name = sc.next();
	    System.out.print("Enter age: ");
	    age = sc.nextInt();
	    System.out.println(" Rollno : "+rollno+"\n Name : "+name+"\n Age : "+age);
	}
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		obj1.SetData(33, "vishakha", 25);
		obj1.GetData();
		obj2.SetData(23, "vishakha", 27);
		obj2.GetData();
		obj3.showdata();
	}
}