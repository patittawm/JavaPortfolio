package Day17;

public class StrMethod1 {

	public static void main(String[] args) {
		// พิมพ์ ตัวแรกกับตัวสุดท้าย
		printFirstAndLast("apple"); //ae
		
		System.out.println("------------");
		
		System.out.println(isUpperCase("HELLO"));
		System.out.println(isUpperCase("Hello"));
		
		System.out.println("----------");
		
		System.out.println(lengthWS("apple")); // 5
		System.out.println(lengthWS("Hi John")); // 6
		System.out.println(lengthWS("ora nge  ")); // 6
	}
	
	/*
	 * lengthWS("apple"); -> 5
	 * lengthWS("Hi John"); -> 6
	 * lengthWS("ora nge  "); -> 6
	*/	
	
	
	public static int lengthWS(String str) {
		// 1. use replace method to remove the spaces replace(" ", "");
		// 2. use length() and return length.
		//str = str.replace(" ", "") ;
		//return str.length();
		return str.replace(" ", "").length();  // ของเบค ทำอย่างนี้
	}
	
	
	/* printFirstAndLast("apple") // ae
	 * printFirstAndLast("hello") // ho
	 * printFirstAndLast("John") // Jn
	 */
	// เวลาสั่งพิม char จะออกมาเป็น ตัวเลข ทีนี้จะทำอย่างไร ต้องใส่ "" เข้าไป
	
	public static void printFirstAndLast(String str) {
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		
		// char + char => int
		System.out.println(firstChar + "" + lastChar);
		
	}
	// เชคว่ามันเป็น uppercase หรือ lowercase
	// isUpperCase("HELLO"); // true
	// isUpperCase("Hello"); // false
	// ใช้เชคว่าเป็นตัวพิมใหญ่ หรือพิมเล็ก
	public static boolean isUpperCase(String str) {
		String upperStr = str.toUpperCase();
		return str.equals(upperStr);
		
	}
}
