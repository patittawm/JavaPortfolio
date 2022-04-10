package day33;

public class MemoryPools {
	public static void main(String[] args) {
		//What's String pool memory? save memory
		//It is spaciak memory for string values.
		//String reuses same values in the string pool
		//It is possible because String is immutable
		String str = "apple";    // string is immutable จีงมีชื่อได้ต่างกัน คือ str และ str1
		String str1 = "apple";
		System.out.println(str==str1); // true
		
		//All Wrapper classes are immutable
		//All Wrapper classes have memory pools similarly as String do
		Integer num = 99;
		Integer num2 = 99;
		Integer num3 = new Integer(99);  // ไม่ควรที่จะครีเอท อย่างนี้ ดัวนั้นจึง มีเส้นขีด
		System.out.println(num == num2); // true
		System.out.println(num == num3); // false
		
		
		
		
	}

}
