package myproject;
public class Array {
public static void  main(String[] args){
	int count1=0;
	int count2=0;
	for (int i = 0; i < 5; i++) {
		count1++;
		for (int j = 0; j < 5; j++) {
			count2++;
		}
	}
	System.out.println(count1 + System.lineSeparator()+" "+ count2);
    System.lineSeparator();
}
}