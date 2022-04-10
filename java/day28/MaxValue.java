package day28;

public class MaxValue {

	public static void main(String[] args) {
		int[] inputArr = {100, 43, 235, 3};
		System.out.println(max(inputArr)); // 235
		System.out.println(max2(inputArr)); 
		
	}
	public static int max2(int[] arrNum) {
		// [100, 43, 235, 3, 500, 1]
		// assume first element is biggest
		// 100
		int biggest = arrNum[0];
		
		// check assumtion
		for(int num : arrNum) {
			//   500    < 1 if we found bigger number
			if (biggest < num) {
			//   500
				biggest = num;
			}
		}
		return biggest;
	}
	
	
	
	/* Brute force solution
	 * return biggest value from array arrNum
	 * max([100, 43, 235, 3])  235
	 * max
	 */
	public static int max(int[] arrNum) {
		for(int i = 0; i < arrNum.length; i++) {
			boolean isBiggest = true;
			for(int j = i + 1; j < arrNum.length;j++) {
				if (arrNum[i] < arrNum[j]) {
					isBiggest = false;
				}
			}
			if(isBiggest) {
				return arrNum[i];
			}
		}
		
		return 0;
	}
}
