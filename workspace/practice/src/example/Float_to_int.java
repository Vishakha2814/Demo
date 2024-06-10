package example;

public class Float_to_int {
//converting bigger datatype into smaller datatype is called explicite downcasting.
	public static void main(String[] args) {
		float  f = 334.5f;// 4 byte 
		long i = (long)f;// 4 byte -----> 1 byte 
		System.out.println(i);
	}

}
