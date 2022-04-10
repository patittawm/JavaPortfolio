package day29;

import java.util.Arrays;

public class StrAndChars {

	public static void main(String[] args) {
		// วิธีทำ String ไปเป็น Array
		String str = "hello";
		//
		char[] chArr = new char[5];
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chArr)); //[h, e, l, l, o]
		System.out.println("---------");
		
		// for each loop iterates over the array by getting each element
		for(char ch : chArr) {
			System.out.println(ch); //ทำไมอันนี้พิมออกมาเป็นแนวตั้งอ่ะ พิมพ์ ออกมาทีละ element ทีละตัว
		}
		System.out.println("---------"); 
		
		String str2 = "John Doe";
		char[] chArr2 = str2.toCharArray();
		System.out.println(str2);					//John Doe
		System.out.println(Arrays.toString(chArr2)); //[J, o, h, n,  , D, o, e]
		

	}

}
