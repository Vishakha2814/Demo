package javaprograms;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class IOfileTest {
	public static void main(String[] args) {
		try {
			 String file = "C:/Users/VISHAKHA/workspace/CDAC/bin/.java";
		        Path path = Paths.get(file);
		        Stream<String> lines = Files.lines(path);
		        lines.forEach(s -> System.out.println(s));
		        lines.close();

			FileWriter fw = new FileWriter("D://Result.txt",true);
			BufferedWriter bW = new BufferedWriter(fw);
			bW.write(100);
			bW.newLine();
			bW.write("vishakha");
			bW.newLine();
			char[] c = {'a','e','i','o','u'};
			bW.write(c);
			bW.newLine();
			bW.write("vishakha");
			bW.newLine();
			bW.close();
			
			StringBuilder str = new StringBuilder("Roll Number:220950320033 ");
		    System.out.println("string = " + str);
		    str.append(" Name: Vishakha Dhamgunde");
		    System.out.println( str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
