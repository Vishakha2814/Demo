package file_handling;

import java.io.File;
import java.io.FileReader;

public class File_reader1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			File f = new File("D://hello.txt");
			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
