package day29;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));// [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		System.out.println(Arrays.toString(num));// [0, 2, 3, 5, 6, 7, 10]

	}

	public static void sortArray(int[] num) {
		for ( int i = 0; i < num.length; i++) {
			//  to find smallest element index from i
			//   6    num[0]
			int min = num[i]; // ใส่ i เพราะว่า ตัวน้อย อาจจะอยู่ จุดอื่น
			//    0
			int minIndex = i;
			//          0
			for(int j = i; j < num.length; j++) { //ให้ j start ที่ i เพราะว่าจะได้ไล่ ตัวน้อย จาก i
				if(min > num[j]) {
					min = num[j];
					minIndex = j;
				}
		    }
			int tmp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = tmp;
	
		}
	//1. outer loop to make a sort for each element
	//2. we need to find min element with starting point
	}//3. swap 
	
	public static void sortArray2(int[] num) {   // line 42 - end คืออีกตัวอย่างนึงที่ใช้ในการหา min เรียงจาก น้อยไปมาก
		for(int i= 0; i < num.length; i++) {
			int minIndex = getMinIndex(num, i);
			int tmp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = tmp;
		}
	}
	public static int getMinIndex(int[] num, int startIndex) {
		int min = num[startIndex];
		int minIndex = startIndex;
		
		for(int i = startIndex; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
