package day47;

public class CheckedException {
	//Thread.sleep(1000); // throws exception
	// and in the main method we are saying main method also 'throws' this 
	// exception
	
	public static void main(String[] args) throws InterruptedException{
		// we can declare exceptions only for method
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // 
		}

	}

}
