package Day24;

public class StaticKeyword2 {
	// - inside static methods we can call/use only static methods and variables
	
	// - inside non static methods we can use static variables and methods directly.
	public static String str;
	public int num;
	
	public static void m() {
		System.out.println("inside m()");
		m2();
		//m3(); ใช้ไม่ได้ เพราะว่า ไม่ได้เป็น static can not called from static method directly
		//StaticKeyword2 obj = new StaticKeyword2(); อันนนี้เราสามารถ ทำอันนี้ เพื่อใช้ได้
		//
	}

	public static void m2() {
		System.out.println("inside m2()");
		
	}
	public void m() { // สามารถเรียก m2 มาใช้
		System.out.println("inside m3()");
		
	}
}
