package example;

public class StringExample {

	    public static void main(String[] args)
	    {
	        String str1 = "Python Exercises";
	        String str2 = "Python Exercise";
	        String endstr = "se";
	        boolean ends1 = str1.endsWith(endstr);
	        boolean ends2 = str2.endsWith(endstr);
	        System.out.println(str1 + " ends with " + " " + endstr + "? " + ends1);
	        System.out.println(str2 + " ends with " + " " + endstr + "? " + ends2);
	    }
	}
