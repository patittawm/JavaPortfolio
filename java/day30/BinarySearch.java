package day30;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5, 11};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5, 11]
		
		Arrays.sort(num);   						
		// หลักการทำงานคือ ตัดตรงกลาง ของการเปรียบเทียบ  half each time
		//แล้วเปรียบเทียบด้านซ้าย ก่อน แล้วค่อยไป ปท ด้านขวาต่อ
		
		// Binary Search works only for sorted data set.
		System.out.println(Arrays.toString(num)); 
		//  0  1  2  3  4  5  6   7
		// [0, 2, 3, 5, 6, 7, 10, 11]
		
		System.out.println(bSearch(num, 6)); // 4
		System.out.println(bSearch(num, 11)); // 7
		System.out.println(bSearch(num, 2)); // 1
		System.out.println(bSearch(num, 50)); //-1
		System.out.println("---------------");
		
		int[] arrNum = {6, 3, 2, 10, 0, 7, 5, 11}; // ลองดูตัวที่เหมือนกัน
		
		Arrays.sort(arrNum);
		System.out.println(Arrays.toString(arrNum));  //[0, 2, 3, 5, 6, 7, 10, 11]
		System.out.println(bSearch(arrNum, 5)); //3
	
	
	}
	/*
	 * return index of target if it exist otherwise return -1;
	 */
	
	public static int bSearch(int[] arr, int target) {
		//TODO
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2 ;
		// target = 10
		//  0  1  2  3  4  5  6    7   
		// [0, 2, 3, 5, 6, 7, 10, 11]
		
		while (arr[mid] != target) {
			if(start > end) {
				return -1;
			}
			if (arr[mid] < target) {  // ต้องการรู้ว่า หลังจากไม่เท่ากับตรงกฃางแล้วจะไปทางไหนต่อ
				start = mid + 1;
			}                        
			if (arr[mid] > target) {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

		return mid;
	}
	
}


//if (arr[mid] < target) {
//	start = mid + 1;
//} else {
//	end = mid - 1;
//}