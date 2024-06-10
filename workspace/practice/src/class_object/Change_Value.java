package class_object;

public class Change_Value {
	int i = 10;
//	public static void main(String[] args) {
//		Change_Value cv = new Change_Value();
//		System.out.println(cv.i);
//		cv.i =1000;
//		System.out.println(cv.i);
//		
//		Change_Value cv1 = new Change_Value();
//		System.out.println(cv1.i);
//	}
public static void main(String[] args) {
	
	Change_Value cv = new Change_Value();
	System.out.println(cv.i);
	
	Change_Value cv1 = new Change_Value();
	System.out.println(cv1.i);
	cv.i = 100;
	cv1.i =19987;
	
}
}
