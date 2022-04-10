package Day10;

public class nRange {

	public static void main(String[] args) {   //ตัวอย่าง มี ข้อแม้ 2 ตัว
		System.out.println(inRange(12));
		System.out.println(inRange(7));
		System.out.println(inRange(20));
		System.out.println(inRange(22));

	}
	public static boolean inRange2(int num) { // อันนี้ใช้ && เข้ามาใช้
		if (num >= 10 && num <= 20) {
			return true;
		}else {
			//return false;
		}
		return false;
	}
	/* 
	 * -create a method that accepts one int argument 
	 * -If method argument within the range from 10 to 20 inclusive
	 * 	return true
	 * -...
	
	*/
	public static boolean inRange( int num) {
		if (num >= 10) {
			if(num <= 20) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
