package Day25;

public class StrBuilder { 
		
	public static void main(String[] args) {
		//String is immutable object that can keep sequence of chars.
		// StringBuilder is mutable object that can keep sequence of chars.
		
		//create StringBuilder with empty value
		StringBuilder sb = new StringBuilder();
		// add value to StringBuilder by using append() method
		sb.append("hello");
		System.out.println(sb); // hello
		//appending more values will adding them to right side of existion value
		sb.append(", world");
		System.out.println(sb); // hello, world
		System.out.println("------------");
		
		StringBuilder tokyo = new StringBuilder();
		tokyo.append("Tokyo");
		tokyo.append(" - population 37M");
		System.out.println(tokyo);  //Tokyo - population 37M
		
		StringBuilder shanghai = new StringBuilder("Shamghai");
		System.out.println(shanghai);	
		shanghai.append(" - population 25M");
		System.out.println(shanghai);
		
		// ทำไมต้องทำ StringBuilder Why do we need StringBuilder when we have String?
		// คำ่ตอบ StringBuilder is good when we have code that changes the value of 
		// String a lot(usually inside the loop)
		// that way we will safe memory.
		// Then should I always use StringBuilder?
		// No!  String is immutable and simple to use.
		
		String strNum = "";
		for (int i = 0; i < 100; i++) {
			strNum = strNum + " " + i;
			
		}
		// 101 String objects are create from line 35-> String strNum = "";
		System.out.println(strNum);
		
		// จากข้างบน ถ้าใช้ StringBuilder จะได้ด้านล่าง
		StringBuilder sbNew = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sbNew.append(" " + i);
		}
		// 1 StringBuilder object got created from line 44
		System.out.println(strNum);
		
	}

}
