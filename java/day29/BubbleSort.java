package day29;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {  //มาจาก SelectionSort  อันนี้ เปรียบเทียบทีละ 2 ทำหลายรอบของแถวจนกว่าจะถูกต้อง
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));// [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		System.out.println(Arrays.toString(num));// [0, 2, 3, 5, 6, 7, 10]

	}
	public static void sortArray(int[] num) {
		int swapCount = -1;
		int len = num.length;   // ถ้าอยู่ใน for loop num.length ต้อง - 1 ก็เลย เอามาเป็น len--  แทน
		//ใช้อะไร ต้องลองดูเป็นเคส
		while(swapCount != 0) {
			swapCount = 0;   //อันนี้สำคัญ เพราะว่า ด้านล่างมี swapCount++ จะเอามา บวกตรงนี้
			len--;
			
			for(int i = 0; i < len; i++) {
				if (num[i] > num[i + 1]) {
					int tmp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = tmp;
					swapCount++;
				}
			}
		}
		
	}
}
