package spring;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AppTest {
	
	public static void test1() {
		
		File file = new File("D://test.txt");
		
		file.exists();
		
		try {
			String str = FileUtils.readFileToString(file , "ISO-8859-1");
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		
		test1();
	}

}
