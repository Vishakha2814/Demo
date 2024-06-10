package example;

//When break statement is encountered inside the loop, 
//the program immediately terminated and program control resume the next statement following the loop.
//Java break statement is used to break the loop..it breaks the current flow of program on specified condition 
//,in case of inner loop it breaks only inner loop.
public class Break_statement {

	public static void main(String[] args) {
	  for (int i = 0; i < 5; i++) {
			if (i > 2) {
				break ;
			}
			System.out.println(i);
		}
	}
}