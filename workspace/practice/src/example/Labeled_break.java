package example;

public class Labeled_break {

	public static void main(String[] args) {
		Lable:for (int i = 0; i < 20; i++) {
			if(i == 7){
				break Lable;
			}
			System.out.println(i);
		}
	}	
}