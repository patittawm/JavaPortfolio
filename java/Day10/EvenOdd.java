package Day10;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 8;
		// find 
		
		//
		if (num % 2 == 0){
			System.out.println(num + " is even");
			
		} else {
			System.out.println(num + " is odd");
		}
	
		OneIntAgu(106);
		OneIntAgu(201);
		
		
	}
		
	
	//todo
	
	public static void OneIntAgu(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");	
		}else {
			System.out.println(a + " is odd");
		}
	}
}
