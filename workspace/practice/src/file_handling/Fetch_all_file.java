package file_handling;

import java.io.File;

public class Fetch_all_file {

	public static void main(String[] args) {
		File f = new File("D://xyz.txt");
		try {
			String[] val = f.list();
			for (String str : val) {
				System.out.println(str);
			}
			System.out.println(val.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
