package file_handling;

import java.io.File;
import java.io.FileReader;

public class File_reader {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			File f = new File("D://hello.txt");
			FileReader fr = new FileReader(f);
			char[] ch = new char[(int)f.length()];
			fr.read(ch);
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
