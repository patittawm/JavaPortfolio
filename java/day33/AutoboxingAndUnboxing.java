package day33;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		char ch = 'a';
		// Autoboxing
		Character chWrapper = ch;
		System.out.println(chWrapper);//a
		
		int num = 99912;
		Integer numWrapper = num;
		System.out.println(numWrapper);//99912
		
		// Unboxing
		Character chWrapper2 = 'e';
		char ch2 = chWrapper2;
		System.out.println(ch2); // e
		
		Double dWrapper = 100.01;
		double d = dWrapper;
		System.out.print(d);//100.01

	}

}
