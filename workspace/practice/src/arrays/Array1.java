package arrays;

public class Array1 {

	public static void main(String[] args) {
	//datatype[] arrayname = new datatype[array length];
		char[] arr = new char[6];
		arr[0] = 'H';
		arr[1] = 'E';
		arr[2] = 'L';
		arr[3] = 'L';
		arr[4] = 'O';

		for (int i = arr.length-1; i >= 0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}		

}