package day48;

import java.io.File;
import java.io.IOException;

public class FilePractice2 {

	public static void main(String[] args) throws IOException{
		// click right -> properties choose path or location result have to be true
		// absolute path is a path from the root folder of file system-> full path
		//File jNotes1 = new File("/Users/patittawut/eclipse-workspace/sdet-java-b5/Root/javaNotes.txt");
		//System.out.println("File exists " + jNotes1.exists());
		
		// relative path is a path which is relative from the place where code is getting executed (location)
		// have to add .. in front -> sdet-java-b5 -> ../sdet-java-b5/Root/javaNotes.txt
		// ../sdet-java-b5/Root/javaNotes.txt have to start from folder
		File jNotes = new File("Root/javaNotes.txt");
		//ต้องการคอนเฟิร์ม ว่า ไฟล์นั้นมีอยู่
		System.out.println("File exists " + jNotes.exists()); // true
		System.out.println("File size is bytes: " + jNotes.length());// 20 byte
		System.out.println("Is File : " + jNotes.isFile()); // true
		System.out.println("Absolute path: " + jNotes.getAbsolutePath());// จะได้ full path
		
		System.out.println("-----------");
		
		//file calss can also represent directories(floder)
		
		File rootDir = new File("Root");
		System.out.println("Is Folder : " + rootDir.isDirectory()); // true -> it is director
		
		File tmpDir = new File("Root/sdet1");  // สร้าง directory 
		if(!tmpDir.exists()) {
			//make directory
			tmpDir.mkdir();
		}
		 File f1 = new File("Root/sdet1/oop.pdf");
		 boolean isCreated = f1.createNewFile(); // this method throws exception
		 System.out.println("Is file create : " + isCreated); // Is file create : false 
		 
		 File f2 = new File(tmpDir.getAbsolutePath() + "/slides2"); // ลองเอา .pdf ออก มันก็จะสร้าง เป็น txt มาให้
		 f2.createNewFile();
		 
		 File f3 = new File(tmpDir.getAbsolutePath() + "/cat.png");
		 f3.createNewFile();
		 
		 File f4 = new File(tmpDir.getAbsolutePath() + "/testCases.xlsx");
		 f4.createNewFile();
		 
	}

}
