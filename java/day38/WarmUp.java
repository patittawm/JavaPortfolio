package day38;
import java.util.Set;
import java.util.LinkedHashSet;
public class WarmUp {

	public static void main(String[] args) {
		// สิ่งที่เรียนผ่านมา ใน day37
		//Set and its implementations
		//What's Set in java and what are implementations of set do you know?
		//Set is of the data structures in Java collections that doesn't allow duplicate
		//HashSet :
		//	- does not allow duplicates
		//	- it doesn't maintain insertion order
		//LinkedHashSet :
		// 	- does not allow duplicate
		//	- it maintains insertion order
		//TreeSet
		//	- does not allow duplicate
		//	- it keep elements in sorted order
		//Queue :
		//	FIFO - First in First out
		//Stack :
		//	LIFO - Last In First out
		
		System.out.println(remDupSet("aaaaa")); // a
		System.out.println(remDupSet("apple")); // aple
		System.out.println(remDupSet("hello"));// helo
		System.out.println(remDupSet("eeetttte"));// et

	}
	/*
	 * 1. Create Set
	 * 2. Add each char of String to the Set
	 * 3. Create new String and append each char from set to this String
	 * 4. Return that new string
	 */
	public static String remDupSet(String str) {
		Set<Character> set = new LinkedHashSet<>();

		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		// เปลี่ยน char เป็น String
		String noDupStr = "";
		for (char ch : set) {
			noDupStr += ch;
		}
		
		return noDupStr;
	}
}
