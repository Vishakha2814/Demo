package example;
import java.util.*;
public class StringExample3 {
	
	public boolean firstInLast(String str) {
	  if (str.length() < 2)
	    return false;
	  else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
	    return true;
	  else
	    return false;
	}
	public static void main (String[] args){
		StringExample3 m= new StringExample3();
	      String str1 =  "educated";
		  
	      System.out.println("The given strings is: "+str1);
	      System.out.println("The first two characters appear in the last is: "+m.firstInLast(str1));
		  }
	}