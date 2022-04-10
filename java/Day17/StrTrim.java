package Day17;

public class StrTrim {
	public static void main(String[] args) {
		// strim() - it removes white spaces around the string value and returns it.
		
		String str = "     orange     ";
		System.out.println(str);
		System.out.println(str.length()); // 16
		
		str = str.trim();
		System.out.println(str);			//orange
		System.out.println(str.length()); // 6
		
		if (str.equals("orange")) {     // ทดสอบความเท่ากันของข้อความที่เราต้องการเปรีียบเทียบ
			
			System.out.println("test pass");
			
		}else {
			
			System.out.println("test failed"); //test pass
		}
 		
		
		
	}
	
	
	
	
}
