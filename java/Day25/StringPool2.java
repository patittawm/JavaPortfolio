package Day25;

public class StringPool2 { // String Pool เมนคือ reuse  object เพื่อประหยัดเมมโมรี่

	public static void main(String[] args) {
		String str = "john";
		String str1 = "john";
		String str2 = new String("john");
		
		//What's the output from this program? Why?
		System.out.println(str == str1); 
		//str == str1 result is true  because in the same object int the String Pool
		//String Pool will try to reuse same objects. เพื่อประหยัดเมมโมรี่
		System.out.println(str == str2);
		//They are not pointing to the same object because
		//of str2 was not create by new keyword. It means it will not use
		//String Pool
		
		
		System.out.println(str.equals(str2));
		// Because .equals method compares actual content of String on equality.
		
		
		
		//str == str2 result is false because str point at “john” but str2 had new string “john”.  
		//str.equals(str2) result is true because..because equals compares actual content of string
		//why in 1 they are pointing to the same object?คำถามต่อมา คืออันนี้ รอคำตอบ
		//คำตอยคือ only the memory where they store you need to mention
	}

}
