package Day12;

public class MathClass {
	public static void main(String[] args) {
		// Math.abs() method returns the absolute(positive value of It's argument.)

		int num = Math.abs(10); 
		int num2 = Math.abs(-10); 

		System.out.println("num: " + num); //10

		System.out.println("num2 : " + num2); //10
		System.out.println(diff10(20, 2));  //true
		System.out.println(diff10(2, 20));	//true
		System.out.println(diff10(7, 8));	//false

		int i = -99;
		System.out.println(Math.abs(i)); // 99

		// Math.ceil() method return a decimal point value up to nearest integer value.
		// It will round up
		double ceil = 3.01;
		System.out.println("ceil : " + ceil); //3.01

		ceil = Math.ceil(ceil);// ปัดขึ้น
		System.out.println("after the Math.ceil()" + ceil); // 4.0

		// Math.floor() method will round down.
		double floorNum = 3.99;
		System.out.println("floor: " + floorNum); // 3.99

		floorNum = Math.floor(floorNum); // ปัดลง
		System.out.println("after the Math.floor(): " + floorNum); // 3.0

		// Math.round() will round decimal point numbers.
		double rNum = 5.5;
		System.out.println("rNum: " + rNum); //5.5

		rNum = Math.round(rNum);
		System.out.println("after Math.round(): " + rNum);  // 6.0

		
		
	}

	
	// if difference between two args is 10 or more, return true otherwise false
	public static boolean diff10(int numOne, int numTwo) {
		int res = numOne - numTwo;
		res = Math.abs(res);
		return res >= 10;
		
	}

}
