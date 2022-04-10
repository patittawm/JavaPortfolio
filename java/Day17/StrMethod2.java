package Day17;

public class StrMethod2 {

	public static void main(String[] args) {
		System.out.println(getFirstTwo("apple")); // ap
		System.out.println(getFirstTwo("Hi"));  // Hi
		System.out.println("--------");
		
		System.out.println(getLastTwo("apple")); // le
		System.out.println(getLastTwo("hello")); // lo
		System.out.println(getLastTwo("hi")); // hi
		System.out.println("--------");
		
		System.out.println(switchWords2("apple")); // apple
		System.out.println(switchWords2("hello world")); // world hello
		System.out.println(switchWords2("java cool")); // cool java
		System.out.println(switchWords2("is cool")); // cool is
		
		
		
	}

	/* getFirstTwo("apple");
	 * getFirstTwo("Hello");
	 * getFirstTwo("John");
	 * getFirstTwo("Hi");
	 */
	
	public static String getFirstTwo(String str) {
		
		//if (str.length() < 2) {
		//	return str;
		//}	
			return str.substring(0,2); //ทำแค่นี้ก็ได้สั้นกว่า
			
	}
	
	public static String getLastTwo(String str) {
		//String str1 = str.substring(str.length()-2, str.length());
		//return str1;
		int len = str.length();
		return str.substring(len - 2);
		
	}
	
	/*
	 * switchWords2("apple");      -> apple
	 * switchWords2("hello world") -> world hello
	 * switchWords2("java cool")   -> cool java
	 * switchWords2("is cool")     -> cool is
	 */
	
	public static String switchWords2(String str) {
		if (str.contains(" ")) {
			String fWord = str.substring(0, str.indexOf(" "));
			String sWord = str.substring(str.indexOf(" ") + 1);
			return sWord + " " + fWord;
		}
		
		return str;
		
		
	}
	
	
}
