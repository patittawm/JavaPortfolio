package day49;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {

	public static void main(String[] args) {
		// try with resources will close them if they were declared inside parenthesis
		try(InputStream input = new FileInputStream("Root/notes.txt")){
			
			int b;
			while ((b = input.read()) != -1) {
				
				System.out.print((char)b);  // ไม่ใช้ println มันจะออกมาเป็นแถวยาวๆ
			}
		} catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
