package day49;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingInputStream {

	public static void main(String[] args) {
		File file = new File("Root/notes.txt");
		InputStream in = null;
		
		try {
			in = new FileInputStream(file);
			int b = 0;
			
			while ((b = in.read()) != -1) {
				System.out.print((char)b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
