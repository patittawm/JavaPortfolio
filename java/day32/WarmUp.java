package day32;
import java.util.Arrays;
public class WarmUp {
	public static void main(String[] args) { // interview question
		int[] res = sumOfTwo(new int [] {1, 2, 3, 4, 5}, 4);
		System.out.println(Arrays.toString(res)); // [1, 3]
		
		res = sumOfTwo(new int [] {7, 7, 4, 3, 8}, 7);
		System.out.println(Arrays.toString(res)); // [4, 3]
		
		res = sumOfTwo(new int [] {9, 8, 12, 3}, 12);
		System.out.println(Arrays.toString(res)); // [9, 3]
		
		res = sumOfTwo(new int [] {1, 2, 2, 1}, 5);
		System.out.println(Arrays.toString(res)); // [0, 0]
	}
	
	/* 
	 * sumOfTwo([1, 2, 3, 4, 5], 4); -> [1, 3]
	 * sumOfTwo([7, 7, 4, 3, 8], 7); -> [4, 3]
	 * sumOfTwo([9, 8, 12, 3], 12); -> [9, 3]
	 * sumOfTwo([1, 2, 2, 1], 5); -> [0, 0]
	 */
	
	public static int[] sumOfTwo(int[] arr, int target) {
		//TODO
		int[] res = new int[2]; // [4,3]
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] + arr[j] == target) {
					res[0] = arr[i];        		// ตรงนี้คิดเองไม่ได้ จดจำไว้ว่าต้องมีอันนี้แล้ว return res;
					res[1] = arr[j]; // res[0] และ res[1] คือผลลัพ ที่เราต้องการได้ มีมี 2 element
					return res;
				}
			} 
		}
		return res;
	}
}
