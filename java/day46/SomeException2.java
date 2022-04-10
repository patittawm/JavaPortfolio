package day46;

public class SomeException2 {

	public static void main(String[] args) {
		//Case int + str ทำให้ exception "432sdfr"
		String strNum = "432";
		//String strNum = "432sdfr";
		int num = Integer.parseInt(strNum);// java.lang.NumberFormatException: For input 
		System.out.println(num);
		
		String str = "apple";
		// str = str.substring(0, 10); //  java.lang.StringIndexOutOfBoundsException: begin 0, end 10, length 5
		
		int[] nums = new int[5]; 
		nums[7] = 100; // java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
	}

}
