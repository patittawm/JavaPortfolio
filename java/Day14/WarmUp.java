package Day14;

public class WarmUp {

	public static void main(String[] args) {
		System.out.println(getNumStr(1));
		System.out.println(getNumStr(3));
		System.out.println(getNumStr(5));
		System.out.println(getNumStr(6));
	}

	/*Return string version of number from 1-5 inclusive
	 * getNumStr(1) -> "One"
	 * getNumStr(2) -> "Two"
	 * getNumStr(3) -> "Three"
	 * getNumStr(5) -> "Five"
	 * getNumStr(6) -> "Not supported"
	 */
	public static String getNumStr(int number) {
		switch (number) {
		case 1:
			return "One";
		// ไม่ใส่ต้อง break เพราะว่ามี return แล้ว ใส่เฉพาะใน main เท่านั้น 
		case 2:
			return "Two";
			
		case 3:
			return "Three";
			
		case 4:
			return "Four";	
		
		case 5:
			return "Five";
			
		default:
			return "Not supported";
		}
	}
	
}
