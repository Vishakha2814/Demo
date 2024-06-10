package file_handling;

import java.io.File;
import java.io.IOException;

public class Create_new_file {

	public static void main(String[] args) {
		File f = new File("D://xyz.txt");
		boolean val;
		try {
			val = f.createNewFile();
			System.out.println(val);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}	