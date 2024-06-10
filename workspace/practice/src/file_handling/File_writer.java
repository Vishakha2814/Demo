package file_handling;

import java.io.FileWriter;

public class File_writer {

	public static void main(String[] args) {
		try {
			FileWriter fW = new FileWriter("D://hello1.txt");
			fW.write(100);
			fW.flush();
			fW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
