package day47;

import java.util.ArrayList;
import java.util.List;

public class ErrorInJava {

	
		public static void main(String[] args) {
			// java.lang.StackOverflowError
//			try {
				
				//method();
				
//			} catch(StackOverflowError e) {
//				System.out.println("Error");
//			}
			
//			throw new StackOverflowError();
		}
		
		public static void method() {
			List<String> list = new ArrayList<>();
			method();
		}

}

