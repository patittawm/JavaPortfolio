package day47;

public class Warmup {

	public static void main(String[] args) {
		// exception
		int i = 0;
		int i2 = 2;
		
		
		try {
			int res = i2 / i;
			System.out.println(res);
			
			//String str = null;
			//str.length();
		
			//catch all runtime exception
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic was there but i will just continue");
			
		} catch(RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println("Exception was there but i will just continue");
			
		}
		System.out.println("In the end of the code");
	}

}
