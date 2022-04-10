package day45;

public class ChocolateDemo {//A2
// main method can not have any thing static
	public static void main(String[] args) {
		
		Chocolate.chocolate = "Abc";
		System.out.println("---------");
		Chocolate obj = new Chocolate();
		System.out.println("---------");
		
		Chocolate obj2 = new Chocolate();
		
		
	}

}
