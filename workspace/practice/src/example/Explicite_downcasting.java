package example;

public class Explicite_downcasting {
//CONVERTING BIGGER DATA TYPE TO SMALLER DATATYPE IS CALLED AS EXPLICIT DOWNCASTING.
	public static void main(String[] args) {
		int i = 100 ;// 4 byte
		byte b = (byte)i ;//1 byte ----> 4 byte
		System.out.println(b);
	}

}
