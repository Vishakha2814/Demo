package file_handling;

import java.io.FileWriter;

public class File_writer1 {

	public static void main(String[] args) {
		try {
			 FileWriter fW = new FileWriter("D://hello1.txt",true);
			 fW.write("hello there i am vishakha.");
			 fW.flush();
			 fW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
