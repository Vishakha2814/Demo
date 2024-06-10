package arrays;

public class Array_col_row {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[][] arr = null;
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
