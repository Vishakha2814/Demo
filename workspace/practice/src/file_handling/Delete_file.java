package file_handling;

import java.io.File;

public class Delete_file {

	public static void main(String[] args) {
		File f = new File("D://xyz.txt");
		try {
			boolean val = f.delete();
			System.out.println(val);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}