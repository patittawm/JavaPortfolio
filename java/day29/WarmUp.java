package day29;

import java.util.Arrays;

public class WarmUp {  // reverse array

	public static void main(String[] args){
		String[] team = {"Alex", "Kuba", "Bek", "Ramesh", "Milena"};
		System.out.println(Arrays.toString(team)); //[Alex, Kuba, Ramesh, Milena]
		
		reverseArr(team);
		System.out.println(Arrays.toString(team)); //[Alex, Kuba, Ramesh, Milena]
		
		team = new String[] {"Tomas", "Anil", "Jared", "Ramesh", "Mari"};
		String[] revArr = returnRevArr(team);
		System.out.println(Arrays.toString(team));
		System.out.println(Arrays.toString(revArr));
		
	}
	
	// 0      1     2      3 
	//[Alex, Kuba, Ramesh, Milena]	ทำการ swap
	// [Alex, Kuba, Ramesh, Milena]
	// [Alex, Kuba, Ramesh, Milena]
	//[Alex, Kuba, Ramesh, Milena]
	//ต้องเริ่มแบบแยกกัน
	public static void reverseArr(String[] arr) {
		int endIndex = arr.length - 1;
		for(int startIndex = 0; startIndex < arr.length / 2; startIndex++) {
			//swap logic
			String tmp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = tmp;
			
			endIndex--;
		}
	}
	public static void reversArr2(String[] arr) {
		for (int startIndex = 0; startIndex < arr.length / 2; startIndex++) {
			// swap logic
			String tmp = arr[startIndex];
			arr[startIndex] = arr[arr.length - startIndex - 1];
			arr[arr.length - startIndex - 1] = tmp;
		}
		
	}
	
	// อีกแบบนีงแต่ดูยากกว่า
	public static String[] returnRevArr(String[] arr) {
		String[] revArr = new String[arr.length];
		int start = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			revArr[start++] = arr[i];
		}
		return revArr;
	}
	
}
