package file_handling;

import java.io.File;

public class Filepath_copy {

	public static void main(String[] args) {
		File f = new File("D:\\xyz\\helloworld.txt");
		try {
			System.out.println(f.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
