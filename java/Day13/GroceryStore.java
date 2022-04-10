package Day13;

public class GroceryStore {

	public static void main(String[] args) {
		double itemPrice = getItemPrice("apple");
		System.out.println("Apple is " + itemPrice + "$");

	}

	/*
	 * bread -> 4.99
	 * water -> 2.99
	 * apple ->1.5
	 * red bull 2.59
	 * kiwi  1.50
	 * grape 2.00
	 */
	
	
	public static double getItemPrice(String item) {
		double price;
		
		switch(item) {
		case "bread":
			price = 4.99;
			break;
		case "water":
		case "grape":  // ทำแบบนี้ ได้เหมือนกัน
			price = 2.99;
			break;
		case "apple", "kiwi": // ราคาเท่ากันเอามาไว้ที่เดียวกันได้
			price = 1.50;
			break;
		case "red bull":
			price = 2.59;
			break;
		default:
			price = -1;
			System.out.println("Invalid item :" + item);
			
		// อย่างอื่่นเอาไป สั้่งพิมพ์ในเมน เมตธอด
		}
		
		return price;
	}
	
}
