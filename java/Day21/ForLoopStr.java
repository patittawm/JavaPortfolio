package Day21;

public class ForLoopStr {

	public static void main(String[] args) {
		
		printChars("Java");
		System.out.println("-------");
		printChars("Apple");
		System.out.println("----");
		printChars("Hello World");
		
		System.out.println("--reverse---");
		printCharsReverse("Java");
		// a
		// v
		// a
		// J
		System.out.println("--count char---");
		System.out.println(countA("Patitta"));
		System.out.println(countA("Argentina"));
		System.out.println(countA("Apple"));

	}
	/*
	 * print each char of str argument in the new line
	 * for loop
	 * charAt(i)
	 * 
	 */
	public static void printChars(String str) {
		
		for(int i = 0; i < str.length(); i++) {  // ในวงเล็บของ length ปล่อยเปล่าไว้
			
			System.out.println(str.charAt(i));
		}
	
	}
	/*
	 * print each char of str argument in reverse order in the new lines
	 */
	public static void printCharsReverse(String str) {
		// 3 -> 0  Java
		
		for( int i = str.length()-1; i >= 0 ; i--) {
			System.out.println(str.charAt(i));
		}
		
	}
	/*
	 * Let's say 'a' and 'A' is special char
	 * Find out how many 'a' and 'A' in the str argument
	 * and return that number
	 * 
	 * 1. Create a numeric variable that should hold the count
	 * 2. Loop over str string and check if char is 'A' or 'a'
	 * 3. if yes increase your count by one
	 * 4. if not just go to the next char
	 * 5. After the loop return result count.
	 * 
	 */
	public static int countA(String str) {
		int count = 0;   // กำหนดตัวนี้ขึ้นมาเพื่อให้นับได้
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);  //กำหนด char ขึ้นมา ตอนแรก ใช้  str.length ก็คิดว่าน่าจะถูก 
			if(ch =='A' || ch == 'a') {  // ลองดูใหม่
				count++;  // ต้องมีไม่งั้นจะไปอ่านตัวบน = 0
			}
		}
		return count;
	}
}
