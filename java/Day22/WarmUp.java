package Day22;

public class WarmUp {
	
	public static void main(String[] args) {
		
		System.out.println(reverseStr("john"));  // nhoj
		System.out.println(reverseStr("test"));  // tset
		System.out.println(reverseStr("apple")); // elppa
	
		System.out.println("-------------");
		
		System.out.println("civic");
		System.out.println("anna");
		System.out.println("level");
		System.out.println("hello");

		System.out.println("-------------");
		
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("anna"));
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("hello"));
		
		
	}
	/*
	 * Return reverse version of argument str
	 * reverseStr("john")  -> "nhoj"
	 * reverseStr("test")  -> "tset"
	 * reverseStr("apple") -> "elppa"
	 */
	
	public static String reverseStr(String str) {
		//1. create new String res, the result will be storage here
		//2. Create for loop that stares from back of the string to beginning
		//3. Inside the loop i will use charAt(i) to get each char
		//   and keep adding to res variable.
		String res = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i); // res += str.charAt(i);
		}
		
		return res;
	}

	public static boolean isPalindrome(String str) {
		
			String strRev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				strRev = strRev + str.charAt(i); 
				
				if (str.equals(strRev)) {
					return true;
				} else {
					
				}
			}	
				return false;

	}

}
