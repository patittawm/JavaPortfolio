package Day14;

public class StrLength {

	public static void main(String[] args) {
		//String is immutable(not changeable ) object that
		//holds sequencer of characters
		//String has many useful methods that allow us work 
		// with it 's value
		
		String str = "apple";
		// length() is used to check the number of characters
		 int numberOfCharecters = str.length();
		 System.out.println("My string has " + numberOfCharecters + " chars");//My string has 5 chars
		 
		 
		 // space also counted as char มันนับ สเปซ ด้วย
		 str = "kiwi is good";
		 System.out.println(str.length()); // 12
		 
		 evenOrOddLength("hello"); // odd length
		 evenOrOddLength("Java");  // even length
		 System.out.println("-----------");
			
			String res = longName("Beknazar");
			System.out.println(res); // long name
			System.out.println(longName("pa")); // short name
			System.out.println(longName("John")); // regular name
	
	}
		public static String longName(String name) {
			//TODO
			// if name length(size) is greater than 7 inclusive, return "long name"
			// if name length(size) is less than 3 inclusive, return "short name"
			// otherwise return "regular name"
			int leg = name.length();
			
			if (leg >= 7) {             // อีกแบบเอา name.length ไปใส่ใน if ได้เลย
				return "long name";
			
			} else if (leg <= 3) {
				return "short name";
			
			}
				return "regular name";

		}
	
		public static void evenOrOddLength(String str) {
			// TODO อันนี้ ใช้ return ไม่ได้เพราะมี void 
			//if argument str's length is even, print "even length"
			//otherwise print "odd length"
			// หรือ ทำแบบนี้ก็ได้ กำหนด int len = str.length(); แล้วใช้ len % 2 == 0
			if (str.length() % 2 == 0) {
				System.out.println("even length");
			}else 
				System.out.println("odd length");
		
		}
	
	
}
