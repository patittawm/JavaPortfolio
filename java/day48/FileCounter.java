package day48;

import java.io.File;

public class FileCounter {  // F1

	private int count = 0;
	
	public int countFiles(String path) {
		File dir = new File(path);
		//&& !dir.getName().equals("CapturePic")
		if(dir.isDirectory()) {// ถ้าต้องการที่จะยกเว้นบาง folder ให้มาใส่เงื่อนไขตรงนี้
			File[] files = dir.listFiles();
			
			if(files != null) {
				
				for(File file : files) {
					if(file.isFile()) {
						count++;
					} else {
						countFiles(file.getAbsolutePath());
					}
				
					
				}  
			}		
				
		}
		return count;
	}
}
