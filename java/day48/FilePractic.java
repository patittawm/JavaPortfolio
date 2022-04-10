package day48;

import java.io.File;

public class FilePractic {

	public static void main(String[] args) {
		//File class represents files and folders in our machine
		// We can get information about the file / folder but we cannot read
		// and write content into the file
		// We can create or delete files / directories using this class
		File myFile = new File("/Users/patittawut/Desktop/LTA class /Book&Doc/OOP in Java.pages");
		System.out.println("File exists : " + myFile.exists());
		System.out.println("File name : " + myFile.getName());
		System.out.println("Path : " + myFile.getAbsolutePath());
		//File class represents files and folders in our machine
		System.out.println("Is file : " + myFile.isFile());
		System.out.println("Is directory : " + myFile.isDirectory());
		System.out.println("Size in byte : " + myFile.length());
		//it will return date in epoch format ->>have to take number go to check in epoch on web
		System.out.println("Last modified : " + myFile.lastModified()); //1647979579314
		// rename จะเปลี่ยนชื่อ ไฟล์ ของเราใน folder โดย ต้องใส่ชื่อใหม่ ใน คำสั่งนี้เลย เชค ดู ได้ใน folder
		myFile.renameTo(new File("/Users/patittawut/Desktop/LTA class /Book&Doc/OOP in Java.pages"));
	}

}
