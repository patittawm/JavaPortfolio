package day47;

public class CheckException {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		
			// Handle checked Exception
			try {
				Thread.sleep(1000); //before use try catch it have red line 
		
			} catch(InterruptedException e) {
				e.printStackTrace();
			
			}
		}

	}

}
