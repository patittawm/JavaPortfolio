package day30;

public class LinearSearch {
	public static void main(String[] args) {
		
		String[] arrNumbers = {"one", "two", "three", "four", "five"};
		
		System.out.println(lSearch(arrNumbers, "two")); // 1
		System.out.println(lSearch(arrNumbers, "five")); // 4
		System.out.println(lSearch(arrNumbers, "six")); // -1
		
	}
	public static int lSearch(String[] arr, String target) {
		//TODO
		// loop over the array by checking each element
		// if element equals to target return index
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {  // ใช้ .equals นี้ไม่ใช่ == เพราะอาจจะผิด สำหรับ string
				return i;					// Array ไม่ใช้ indexOf ด้วยนะ
			}
		}
		return -1;
	}
}
