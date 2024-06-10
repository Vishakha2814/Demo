package file_handling;

import java.io.File;

public class Exist_file {

	public static void main(String[] args) {
		File f = new File("D://xyz.txt");
		boolean val = f.exists();
		System.out.println(val);
	}

}
