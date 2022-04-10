package day49;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	// Streams can be used with any data types
	// Readers/Writers good to work with text files
	public static void main(String[] args) {
		System.out.println("copy is started");
		
		//copy("Root/switch_1.mp4", "Root/switch_copy.mp4"); 
		copy("Root/switch_1.mp4", "Root/switch_copy_buffered.mp4"); // ใข้วิธี buffer จะดีกว่า
		System.out.println("copy is completed");

	}

	public static void copy(String sourcePath, String targetPath) {
		try (InputStream input = new FileInputStream(sourcePath);
			 OutputStream output = new FileOutputStream(targetPath)) {
			
			byte[] buffer = new byte[1024]; // บอกว่าให้โหลด กี่ไบท์  ก่อนหน้านี้ไม่มี buffer จะโหลดนานมาก
			int b;
			while ((b = input.read(buffer)) != -1) {
				output.write(buffer, 0, b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copy2(String s, String t) {
		try (BufferedInputStream bInput = new BufferedInputStream(new FileInputStream(s));
			 BufferedOutputStream bOutput = new BufferedOutputStream(new FileOutputStream(t))) {
			
			int b;
			while ((b = bInput.read()) != -1) {
				bOutput.write(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
