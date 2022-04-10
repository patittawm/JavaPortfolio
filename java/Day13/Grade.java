package Day13;

public class Grade {

	public static void main(String[] args) {
		displaScore('A'); // Mon: 1
		displaScore('a');
		displaScore('F');
		displaScore('c');
	}

	/*
	 * "Sun" -> Sun: 0
	 * "Mon" -> Mon: 1
	 * "Tue" -> Tue: 2
	 * "Wed" -> Wed: 3
	 * "Thur"-> Thur: 4
	 * "Fri" -> Fri: 5
	 * "Sat" -> Sat: 6
	 * otherwise invalid input.
	 */
	

	public static void displaScore(char grade) {
		//TODO to complete this method
		switch(grade) {
		case 'A', 'a':
			System.out.println("90 - 100");
			break;
		case 'B':
		case 'b':
			System.out.println("65 - 89");
			break;
		case 'C','c':
			System.out.println("50 - 64");
			break;
		case 'F','f':
			System.out.println("Less than 50");
			break;	
			
		default:
			System.out.println("invalid input");
			
			
		
		}
		
		
		
		
	}
	
}
