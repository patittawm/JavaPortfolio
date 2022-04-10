package day49;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesStream {

	public static void main(String[] args) {
		// InputStreams - for reading data
		// OutputStreams - for writing data
		
		try(OutputStream output = new FileOutputStream("Root/test.txt")){
			
			output.write(72);
			output.write(73);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
