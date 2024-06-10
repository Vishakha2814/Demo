package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered_reader {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:/Users/VISHAKHA/Desktop/cdacjava/SSN.txt",true);
			BufferedWriter bW = new BufferedWriter(fw);
			bW.write(100);
			bW.newLine();
			FileReader fr = new FileReader("C:/Users/VISHAKHA/Desktop/cdacjava/SSN.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
