package Day10;

public class Greater {

	public static void main(String[] args) {
		System.out.println(graNum(199.5));
		
		double res = graNum(50.9);
		System.out.println(res); // 100.0
	}
	
	public static double graNum(double num) {
		if (num >100) {
			return num;
		}else {
			return 100.0;
		}
	}
	
}

