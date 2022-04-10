package Day18;

public class Score {

	enum Grade{A, B, C, F};
	
	public static void main(String[] args) {
		displayScore(Grade.A);
		displayScore(Grade.C);
		displayScore(Grade.F);

	}
	// ถ้าเป็น if .. else ทำแบบนี้
	public static void displayScore2(Grade grade) {
		if (grade == Grade.A) {
			System.out.println("Your score : 90 - 100");
		} else if ( grade == Grade.B) {
			System.out.println("Your score : 65 - 89");
		} else if ( grade == Grade.C) {
			System.out.println("Your score : 50 - 64");
		} else if ( grade == Grade.F) {
			System.out.println("Your score : Your score :  Less than 50");
		}
	}

	/*
	 * if grade is A then print "Your score : 90 - 100"
	 * if grade is B then print "Your score : 65 - 89"
	 * if grade is C then print "Your score : 50 - 64"  
	 * if grade is F then print "Your score :  Less than 50"
	 */
	public static void displayScore(Grade g) {
		switch(g) {
		case A:
			System.out.println("Your score : 90 - 100");
			break;
		case B:
			System.out.println("Your score : 65 - 89");
			break;
		case C:
			System.out.println("Your score : 50 - 64");
			break;
		case F:
			System.out.println("Your score : Your score :  Less than 50");
			break;
		default:
			System.out.println("Invalid grade");  // มีไว้เพื่อเอาไว้เชค ว่ามีค่าผิดใส่มาไหม
			
		}
	
	}
	
}
