package Day16;

public class StrCharAt2 {

	public static void main(String[] arges) {
		System.out.println(getLastChar("apple")); //e
		System.out.println(getLastChar("John")); // n
		System.out.println(getLastChar("kiwi")); // i
		System.out.println(getLastChar("hello")); // o
		System.out.println(getLastChar("Bek")); // k
	
		// ตัวอย่าง สำหรับ โจทย์ ข้างบน กับข้างล่าง 
		//            01234
		String str = "apple";
		System.out.println(str.charAt(4)); //e
		//     012
		str = "Bek";
		System.out.println(str.charAt(2)); // k

	}
	// หาว่าตัวสุดท้ายของข้อความคือตัวอะไร โดยใช้ length() แล้ว ลบ 1 
	//เพราะว่า length บอกจำนวนทั้งหมดของตัว string แต่การนับ index เริ่มตั้งแต่ 0
	//ดังนั้น จึง ลบ 1
	public static char getLastChar(String str) {
		char lastChar = str.charAt(str.length() - 1);
		return lastChar;
		
	}
	
}
