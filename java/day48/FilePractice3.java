package day48;

import java.io.File;

public class FilePractice3 {

	public static void main(String[] args) {
		// mkdir() to create directory
		// createNewFile() to create file
		
		File myFolder = new File("Root/sdet1");
		
		// return all files and folders from directory
		File[] files = myFolder.listFiles();
		System.out.println("Number of files : " + files.length); // อันนี้ไฟล์ ใหญ่ 
		
		for(File file : files) {
			System.out.println(file.getName() + " : " + file.length()); // อันนี้ ในไฟล์ เล็ก
			
		}

	}

}
