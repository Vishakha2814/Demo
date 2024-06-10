package example;

public class StringCompare {
	public static void main(String[] args){
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";
        boolean equals1 = str1.equalsIgnoreCase(str2);
        boolean equals2 = str1.equalsIgnoreCase(str3);
        System.out.println(" " + str1 + " "+ equals1 +" " +str2 + "? " + equals1);
        System.out.println(" " + str1 + " "+ equals2 +" " +str3 + "? " + equals2);
    }
}
