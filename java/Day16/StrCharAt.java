package Day16;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(index) ->it return single char form given index
		//			  01234     เริ่มนับตั้งแต่ 0
		String str = "home";
		char ch = str.charAt(1);
		
		System.out.println(str); // home
		System.out.println(ch);   // o
		
		
		//             012345
		String str2 = "public";
		char ch2 = str2.charAt(4);
		System.out.println(ch2); //i
		
		//             012345      รวม space ด้วย
		String str3 = "ap ple";
		char ch3 = str3.charAt(2);
		System.out.println("space : " + ch3);
		System.out.println("---------");
		
		char ch4 = getFirstChar("hello");
		System.out.println(ch4);
		
		System.out.println(getFirstChar("Apple")); //A
		System.out.println(getFirstChar("Java")); //J
		
	}
	
	//
	//	
	public static char getFirstChar(String str ) {
		//return first char of str
		char ch4 = str.charAt(0);    
		return ch4;					
		
		
		// Bek ใช้แบบนี้ firstChar เราใช้ ch4
		//char firstChar = str.charAt(0);   //คือชื่อที่ตั้งไม่เหมือนกัน แต่ดูแล้วไม่มีผลอะไรต่อคำตอบ
		//return firstChar;
		
	}
	
}
