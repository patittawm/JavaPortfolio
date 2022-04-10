package Day20;
import java.util.Scanner;
public class FavoriteNum {

	public static void main(String[] args) {
		final int myFavoriteNumber = 7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can you guess my favorite number?");
		int enteredNumber = sc.nextInt();
		
		while (myFavoriteNumber != enteredNumber) {
			System.out.println("No," + enteredNumber + "is not my favorite number.");
			
			System.out.println("Try again");
			
			enteredNumber = sc.nextInt();
		}
		
		
		//if (myFavoriteNumber == enteredNumber) {
			System.out.println("You got it! My favorite number is " + myFavoriteNumber);
		
		//} else {
		//	System.out.println("No, " + enteredNumber + " is not my favorite number.");
		//}
			// while condition while (myFavoriteNumber != enteredNumber){ }
			// body of the loop:
			//  1. Msg that asks
			//  2. enteredNumber = sc.nextInt();
			//After the loop, success msg
		
		
		 
			
			
			
			//if(myFavoriteNumber != 7)
		// ไม่มี break 
		
	}

}
