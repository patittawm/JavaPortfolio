package Day19;

public class WarmUp {

	public static void main(String[] args) {
		System.out.println(isLastUpper("hello"));
		System.out.println(isLastUpper("hellO"));
		System.out.println(isLastUpper("JAVA"));
		System.out.println(isLastUpper("Apple"));
		
		
	}
	/*
	 * if last char of str is upper case letter return true, otherwise false
	 * isLastUpper("Hello"); -> false
	 * isLastUpper("hellO";  -> true
	 */
	
	
	public static boolean isLastUpper(String str) {
		String lastCharUpper = str.substring(str.length()-1);  // ได้ตัวสุดท้าย	
		if(lastCharUpper.equals(lastCharUpper.toUpperCase())){
			return true;
		} else
		return false;
	// 1. Get last char save in var and make it to upper case
		// 2. Compare original last char with upper case last char
		//    if it is true then it was already in upper case so we can
		//    return true.
	//OR
		//String lastCharUpper = str.substring(str.length()
		//String lastCharUpper = str.substring(str.length() - 1).toUpperCase();
		//String lastCharOriginal = str.substring(str.length() - 1);
		//return lastCharUpper.equals(lastCharOriginal);
		
	}
	
	public static boolean isLastUpper2(String str) {
		char lastChar = str.charAt(str.length() - 1);
		//We use wrapper class method here Character.isUpper(char)
		//Wrapper classes ate object representation of primitive
		return Character.isUpperCase(lastChar);
		
	}
	public static boolean isLastUpper3(String str) {
		char lastChar = str.charAt(str.length() - 1);             
		char lastCharUpper = String.valueOf(lastChar).toUpperCase().charAt(0);
		return lastChar == lastCharUpper;
	}
	
}
		
