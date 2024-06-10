package example;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
        String newstr = str.replace('d', 'f');
        
        System.out.println("Original String: " + str);
        System.out.println("New String: " + newstr);
	}

}
