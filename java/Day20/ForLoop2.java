package Day20;

public class ForLoop2 {

	public static void main(String[] args) {
		// Can you write the program that will print 5 time 
		// "Java is awesome!" by use for loop
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i + " Java is awesome!");
		}
		System.out.println("------");
		
		//write the program that will print number from 1 to 100 inclusive
		//in the same line by using for loop
		//1 2 3 4 5 6 7 8 9 10
		//System.out.print(i + " ");
		
		// อันนี้ i ข้างบนกับอันนนี้ จะไม่รู้จักกัน มันอยู่ใน body ของแต่ละ loop ดังนั้นใช้ i เฉยๆ ได้
		// ดังนั้นจะเปลี่ยนจาก i2 เป็น i
		for(int i2 = 1 ; i2 < 101 ; i2++) {
			System.out.print(i2 + " ");
		}
		System.out.println();
		
		System.out.println("------");
		
		//TODO
		// write the program that will print numbers from 100 to 1 inclusive
		// in the same line by using for loop.
		// 100 99 98 97 96 95 ...
		
		for (int i = 100 ; i >= 1 ; i-- ) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
