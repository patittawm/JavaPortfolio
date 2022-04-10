package day48;

public class FileCountDemo { // F2

	public static void main(String[] args) {
		int count = new FileCounter().countFiles("../sdet-java-b5/src");//Number of files :333
		System.out.println("Number of files :" + count);

		FileCounter fileCount = new FileCounter();
		int numberOfFiles = fileCount.countFiles("/Users/patittawut/Desktop");
		System.out.println("Number of file in my desktop : " + numberOfFiles);
		
		
	}

}
