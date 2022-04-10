package day49;

import java.io.File;

public class FileRewiew {

	public static void main(String[] args) {
		//File path :
		// - absolute file path is path from the root directory of file system
		// - relative file path is a path from the place where code is getting excecute
		
		// File class represents directories and files in java
		// - it has many useful methods to get information about the file
		// - it can create/delete files and directories
		File file = new File("/Users/patittawut/eclipse-workspace/sdet-java-b5/Root/javaNotes.txt");
		System.out.println(file.exists());
		
		File file2 = new File("Root/javaNotes.txt");
		System.out.println(file2.exists());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.length());
		
		File file3 = new File("Root/sdet1/oop.pdf");
		try {
			if (!file3.exists()) {
				file3.createNewFile();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		boolean isDeleted = file3.delete();
		System.out.println("is deleted: " + isDeleted);
	}

}
