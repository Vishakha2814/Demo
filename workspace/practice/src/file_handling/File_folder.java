package file_handling;

import java.io.File;

public class File_folder {

	public static void main(String[] args) {
		File f = new File("D://xyz11.txt");
		try {
			boolean val = f.mkdir();
			System.out.println(val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
