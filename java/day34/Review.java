package day34;

public class Review {

	public static void main(String[] args) {
		// varargs argument of method

		int res = multiply(2, 3);
		System.out.println("res " + res);
		
		System.out.println("res2 " + res);
		
		int[] input = {1,2,3,4,5};
		System.out.println("res3 " + multiply(input));
	}
	// 1. Only one vararg per method argument.
	// 2. When vararg is used with other 
	public static int multiply(int...nums) {
		int sum = nums[0];
		for(int i = 1; i < nums.length; i++) {
			sum *= nums[i]; //กำหนดให้มันเอามา คูณ กันตรงนี้
		}
		return sum;
	}
}
