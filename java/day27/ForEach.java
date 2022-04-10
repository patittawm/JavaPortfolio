package day27;
import java.util.Arrays;
public class ForEach { // last type of Loop

	public static void main(String[] args) {
		// for each - it will iterate each element from array
		int[] numArr = { 10, 11, 14, 55, 43, 32, 99 };
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		System.out.println("----------");

		for (int num : numArr) {
			System.out.println(num);
		}
		System.out.println("----------");

		String[] names = { "Alex", "Ramesh", "Kuba", "Thomas", "Anil" };
		for (String str : names) {
			System.out.println(str);
		}
		System.out.println("----------");

		char[] chaArr = { 'a', 'b', 'c', 'd', 'e' };
		// TODO print each element one by one by using for each loop
	   //single value : array value
		for (char cha : chaArr) {		// กำหนดตัวแปรมาเก็บค่า ต้องให้เป็น data type ตัวเดียวกันกับ element
			System.out.println(cha);
		}
		System.out.println("----------");
		double[] dArr = { 99.9, 10.8, 5.5, 3.1, 2.3 };
		// TODO print each element one by one by using for each loop
		for (double darr : dArr) {		// กำหนดตัวแปรมาเก็บค่า ต้องให้เป็น data type ตัวเดียวกันกับ element
			System.out.println(darr);
		}
		// you cannot change values of array by using for each loop.
		
		String[] lang = {"Java", "js", "Python", "php"};
		// make all values to upper case
		
		//for (String str : lang) {   //ใช้แบบนี้ไม่ได้ต้องใช้แบบด้านล่าง
		//	str = str.toUpperCase();
		
		//}
		//[String , String , String, String]
		for(int i = 0; i < lang.length; i++) {
			lang[i] = lang[i].toUpperCase();
			System.out.println(lang); // [Ljava.lang.String;@1dbd16a6
			System.out.println(Arrays.toString(lang)); // [JAVA, JS, PYTHON, PHP]
	}
	}
}
