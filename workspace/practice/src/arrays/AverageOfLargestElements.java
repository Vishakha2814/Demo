package arrays;


public class AverageOfLargestElements {
	public static void main(String[] args) {
		
	int arr[] = {6, 20, 30, 55, 58, 90, 78, 2, 22};
	int first = Integer.MIN_VALUE;
	int second = Integer.MAX_VALUE;
	double sum, avg;
	 for(int i = 0; i < arr.length; i++){
		 if (arr[i]>first) {
			second = first;
			first = arr[i];
		}else if (arr[i] > second) {
			second = arr[i];
		}
	 }
	 System.out.println("Largest Number = " + first + 
		        " Second Largest Number = " + second);
	 sum = first + second;
	 avg = sum/2;
	  System.out.println("Average :" + avg);
	}
}