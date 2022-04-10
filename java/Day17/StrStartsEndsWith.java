package Day17;

public class StrStartsEndsWith {

	public static void main(String[] args) {
		// startWith(String)
		
		String str = "Java is object oriented programming language";
		
		System.out.println(str.startsWith("Java is obj")); // true
		System.out.println(str.startsWith("is object")); // false
		
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("java")); // false
		System.out.println(str.startsWith("Java is onject oriented programming language")); // true
		
		
		//boolean starts = str.startsWith("programming"); // ถ้ามีค่านี้ เราสามารถใช้เป็น if ค่าต่างๆ ได้
		
		
		System.out.println("------");
		String str2 = "Selenium is web automation tool";
		boolean ends = str2.endsWith("ool");
		System.out.println(ends); //true
		
		System.out.println(str2.endsWith("Selenium is web automation tool")); //true
		

	}

}
