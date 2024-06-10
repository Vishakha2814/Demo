package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffered_writer {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://hello.txt",true);
			BufferedWriter bW = new BufferedWriter(fw);
			bW.write(100);
			bW.newLine();
			bW.write("vishakha");
			bW.newLine();
			char[] c = {'a','b','c'};
			bW.write(c);
			bW.newLine();
			bW.write("vishakha");
			bW.newLine();
			bW.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
