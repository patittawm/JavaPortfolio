package day29;

import java.util.Arrays;

public class StrSplit {
	public static void main(String[] args) {
		//split(by) it will split String into the array based on splitter
		String str = "Java 101 for SDET 2022";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]);//Java
		System.out.println(words[words.length - 1]); //2022
		
		String[] parts = str.split("for");
		System.out.println(parts.length); //2
		System.out.println(parts[0]);  //Java 101 
		System.out.println(parts[1]); //SDET 2022
		
		str = "Java, python, php, python, abc";   //"Java, python, php, python, abc";
		String[] arr = str.split(",");
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr)); //[Java,  python,  php]
		
		String[] arr2 = str.split(", python, "); // แยกจากประโขยคข้างบน "Java, python, php"
		System.out.println(arr2.length); //3
		System.out.println(arr2[0]);  //
		System.out.println(arr2[1]);  //
		
		System.out.println("-------");
		String[] arr3 = str.split(":");  // ตัวอย่างถ้าสปริท โดยไม่มีในประโยค จะพิมพ์ ออกมาให้หมด
		// if string dose not contain the splitter the whole string
		// will assigned as first element of array
		System.out.println(arr3.length); //1
		System.out.println(Arrays.toString(arr3)); //[Java, python, php, python, abc]
		System.out.println(arr3[0]); //Java, python, php, python, abc
		
		

	}

}
