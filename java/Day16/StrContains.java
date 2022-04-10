package Day16;

public class StrContains {

	public static void main(String[] args) {
		
		//Contains(String) is use to check if string contains another string
		// return type of this method is boolean
		// คอนเทน คือ มันมีคำที่เราต้องการ ปนอยู่ในประโยคหรือไม่ไม่ว่าจะเป็นแค่ตัวอักษร หรือ คำ หรือเครื่องหมาย
		String topic = "Variables, assignment operators, arithemetic";
		boolean isThere = topic.contains("assignment");
		System.out.println(isThere);
		
		
		System.out.println(topic.contains("john"));
		System.out.println(topic.contains("ales"));
		System.out.println(topic.contains("rs, a")); // true
		System.out.println(topic.contains("ment  ")); // false
		
		String str = "Java is cool";
		System.out.println(str.contains("Java is cool")); // true
		System.out.println(str.contains("is")); // true
		System.out.println(str.contains("are")); // false
		

	}

}
