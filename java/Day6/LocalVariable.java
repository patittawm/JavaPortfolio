package Day6;

public class LocalVariable {

	public static void main(String[] args) {
		/*
		 * Local variables are variables we created
		 * inside method or statements(if else, loops).
		 * - they don't have default values. If you try to use without 
		 *   assigning value, then you will get compiler error.
		 * - they cannot have access modifiers.  
		 */
		
		String firstName = "John";
		String lastName = "Doe";
		int age = 25;
		
		String str;
		// System.out.println(str); does not compile
		
		str = "Apple";
		System.out.println(str);
		
		// public int num = 8; does not compile ไม่สามารถ ใส่ public ในนี้ได้
		
		
	}

}
