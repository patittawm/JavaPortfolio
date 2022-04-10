package Day13;
import java.util.Scanner;
public class DayOfWeek2 {

	public static void main(String[] args) {
		printNumOfDay("Mon");
		printNumOfDay("Sun");
		printNumOfDay("Fri");
		printNumOfDay("apple");
		
	}

	/*
	 * "sun" -> sun : 0
	 * "Mon" -> Mon: 1
	 */
	
	public static void printNumOfDay(String day) {
		
		
		
		switch(day) {
		case "Sun":
			System.out.println("Sun : 0");
			break;
		case "Mon":
			System.out.println("Mon : 1");
			break;
		case "Tue":
			System.out.println("Tue : 2");
			break;
		case "Wed":
			System.out.println("Wed :3");
			break;
		case "Thur":
			System.out.println("Thur : 4");
			break;
		case "Fri":
			System.out.println("Fri :5");
			break;
		case "Sat":
			System.out.println("Sat : 6");
			break;
			
		default:
			System.out.println("Invalid input");
		}
		
		
	}

	
}


