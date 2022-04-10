package Day6;

public class Box {
   // อันนี้ไม่ใช่ instance variables และไม่ใช่ static variables ทุกอย่างอยู่ใน main method
	public static void main(String[] args) {
		String box = "flowers";
		System.out.println(box);
		
		box = "books";
		System.out.println(box);
		
		/*ที่ส่งไปแบบนี้ แต่ผิด ต้อง reassign ที่ถูกคือด้านบน
		String box = “Squre”;
		System.out.println(box);
		
		String flowers = “Lily”;
		System.out.println(box);
		
		String books = “Harry Potter”;
		System.out.println(box);
		*/
	}

}		
		/*TODO :
		Create a java class Box
		Declare String variables :  box
		Assign values as flowers
		Print variable box
		Reassign value as books
		Print variable box
		*/
		
		
		

