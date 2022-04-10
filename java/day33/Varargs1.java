package day33;

public class Varargs1 {

	public static void main(String[] args) {
		System.out.println(join("hello", "world"));
		System.out.println(join("apple", "orange", "banana"));
		System.out.println(join("one", "two", "three", "four", "five"));
		
		String[] langs = {"java", "python", "js", "ruby", "php"};
		System.out.println(join(langs));

	}
	// TODO join method concatenates all its arguments and return as one string
	public static String join(String...str) {  // ต้องสั่งให้เป็น string เหมือนกัน
		//varargs works exactly as array inside the method
		String s = "";
		for(String str1 : str) {
			s += str1;
		}
		return s;
	}
	// 1. Only one vararg per method เช่น
	//public static void myMethod(String...words, int...nums) {
	//	it not work
	//}
	// 2.The vararg argument should be the last one if method has other arguments				
	//								   regular    regular       vararg
	//public static void myMethod(String words, double dNum , int...nums) {
		
	//}
	
}
