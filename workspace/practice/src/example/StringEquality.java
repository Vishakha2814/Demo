package example;

public class StringEquality {

	public static void main(String[] args)
    {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";
        boolean equals1 = str1.equals(str2);
        boolean equals2 = str1.equals(str3);
        System.out.println(str1+" Equals "+str2+" :"+equals1);
        System.out.println(str1+" Equals "+str3+" :"+equals2);
    }

}
