package this_keyword;

public class Student{
	private static int rollno;
	private String name;
	private int age;

	public void SetData(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public void GetData(){
		System.out.println("Displaying runtime assiged value");
		System.out.println(rollno+" "+name+" "+age);
	}
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		Student obj2 = new Student();

		obj1.SetData(33,"Vishakha",26);
		obj1.SetData(101,"Bob",27);
		
		
	}
}