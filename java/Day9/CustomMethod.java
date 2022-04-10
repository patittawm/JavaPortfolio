package Day9;

public class CustomMethod {

	public static void main(String[] args) {
		
		plus100(5.5);
		//or
		//double res = plus100(5.5);
		System.out.println(plus100(9.0));
		
	}
	public static double plus100(double dNum) {

		return dNum + 100;

	}
}	
