package Day20;

public class DoWhileLoop {

	public static void main(String[] args) {
		// while(condition) { body }
		// do {body} while (condition); เรารู้ว่ามีจำนวนเท่าไหร่
		
		int i = 0;   // กำหนดค่าเริ่มต้น
		do {
			System.out.println("Hello, World!");
			i++;
		}while (i < 2);
		
		int i2 = 0;  //กำหนดค่าเริ่มต้น
		while (i2 < 2) {
			System.out.println("Good day!");
			i2++;
			
		}
		// What's the difference between while loop and do while loop?
		// while loop can have 0 iterations because body is after the condition.
		// do while will have at least one iteration because body is before the condition.
		
		do {
			System.out.println("From do while");
		} while (false);
		
		
		
	}

}
